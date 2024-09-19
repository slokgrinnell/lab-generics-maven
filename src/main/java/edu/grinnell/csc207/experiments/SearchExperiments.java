package edu.grinnell.csc207.experiments;

import java.io.PrintWriter;

import edu.grinnell.csc207.util.SearchUtils;
import edu.grinnell.csc207.util.predicates.OddInteger;
import edu.grinnell.csc207.util.predicates.SmallString;
import edu.grinnell.csc207.util.predicates.SmallObject;

/**
 * A simple set of experiments with predicates and searching.
 *
 * @author Samuel A. Rebelsky
 * @author Your Name Here
 */
public class SearchExperiments {
  /**
   * Run the experiments.
   *
   * @param args
   *   Command-line arguments (ignored).
   */
  public static void main(String[] args) {
    // Prepare for output.
    PrintWriter pen = new PrintWriter(System.out, true);

    // Set up a few arrays to search.
    Object[] strings =
        new Object[] {"alpha", "bravo", "charlie", "delta", "echo", "foxtrot",
            "golf", "hotel", "india", "juliett", "kilo", "lima", "mike",
            "november", "oscar"};
    Integer[] numbers =
        new Integer[] {2, 3, 5, 7, 9, 11, 13, 15, 17, 18, 32, 42};

    // Okay, we're ready for the experiments
    pen.println("A small string: "
        + SearchUtils.search(strings, SmallObject.PRED));
    pen.println("An odd integer: "
        + SearchUtils.search(numbers, OddInteger.PRED));
  } // main(String[])

} // class SearchExperiments
