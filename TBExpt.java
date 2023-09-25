import java.io.PrintWriter;

/**
 * A series of experiments with the text block layout classes.
 *
 * @author Samuel A. Rebelsky
 * @version 1.3 of September 2019
 */
public class TBExpt {
    // +------+--------------------------------------------------------------
    // | Main |
    // +------+

    public static void main(String[] args) throws Exception {
        // Prepare for input and output
        PrintWriter pen = new PrintWriter(System.out, true);

        // Create a block to use
        TextBlock hello = new TextLine("Hello");
        TextBlock hello2 = new TextLine("Hello");
        TextBlock greeting = new TextLine("Greeting");
        BoxedBlock boxedBlock = new BoxedBlock(hello);
        TripleStarBlock tripleStarBlock = new TripleStarBlock(hello);
        System.out.println(hello.width());
        VComposition vCompose = new VComposition(hello, greeting);
        VComposition vCompose1 = new VComposition(hello, hello2);
        RightJustified rightJustified = new RightJustified(vCompose, 5);
        Truncated truncatedStr = new Truncated(boxedBlock, 15);
        Centered centered = new Centered(hello, 12);
        HorizontallyFlipped horizontallyFlipped = new HorizontallyFlipped(boxedBlock);
        VerticallyFlipped verticallyFlipped = new VerticallyFlipped(vCompose);

        HorizontallyFlipped horizontallyFlipped1 = new HorizontallyFlipped(new HorizontallyFlipped(new TextLine("Hello")));

        // Print out the block
//        TBUtils.print(pen, vCompose);
//        TBUtils.print(pen, boxedBlock);
//        TBUtils.print(pen, centered);
//        TBUtils.print(pen, truncatedStr);
//        TBUtils.print(pen, horizontallyFlipped1);
//        TBUtils.print(pen, rightJustified);
        TBUtils.print(pen, tripleStarBlock);


        if (TBUtils.eqv(vCompose1, vCompose)) {
            pen.println("function works not right");
        } else {
            pen.println("function works right");
        }
        // Clean up after ourselves.
        pen.close();

    } // main(String[])

} // class TBExpt
