package st1920.automaton;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Task3_2 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test001");
        String str0 = RegExpMatcher.makeNum();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "1" + "'", str0.equals("1"));
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test002");
        String str2 = RegExpMatcher.makeConcatenation("1", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test003");
        String str0 = RegExpMatcher.makeAlpha();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "a" + "'", str0.equals("a"));
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test004");
        boolean boolean2 = RegExpMatcher.matches("hi!", "a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test005");
        boolean boolean2 = RegExpMatcher.matches("", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test006");
        String str2 = RegExpMatcher.makeConcatenation("1", "1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "11" + "'", str2.equals("11"));
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test007");
        boolean boolean2 = RegExpMatcher.matches("1", "a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test008");
        Object obj0 = new Object();
        Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test009");
        String str2 = RegExpMatcher.makeConcatenation("a", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a" + "'", str2.equals("a"));
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test010");
        String str2 = RegExpMatcher.makeConcatenation("11", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "11hi!" + "'", str2.equals("11hi!"));
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test011");
        String str2 = RegExpMatcher.makeConcatenation("hi!", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test012");
        String str2 = RegExpMatcher.makeConcatenation("a", "11");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a11" + "'", str2.equals("a11"));
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test013");
        RegExpMatcher regExpMatcher0 = new RegExpMatcher();
        Class<?> wildcardClass1 = regExpMatcher0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test014");
        String str2 = RegExpMatcher.makeConcatenation("1", "a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1a" + "'", str2.equals("1a"));
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test015");
        String str2 = RegExpMatcher.makeConcatenation("11hi!", "11");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "11hi!11" + "'", str2.equals("11hi!11"));
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test016");
        String str2 = RegExpMatcher.makeConcatenation("a", "a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "aa" + "'", str2.equals("aa"));
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test017");
        boolean boolean2 = RegExpMatcher.matches("1", "a11");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test018");
        boolean boolean2 = RegExpMatcher.matches("11", "1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test019");
        boolean boolean2 = RegExpMatcher.matches("hi!", "1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test020");
        String str2 = RegExpMatcher.makeConcatenation("hi!", "1a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!1a" + "'", str2.equals("hi!1a"));
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test021");
        String str2 = RegExpMatcher.makeConcatenation("hi!", "aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!aa" + "'", str2.equals("hi!aa"));
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test022");
        boolean boolean2 = RegExpMatcher.matches("a11", "11hi!11");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test023");
        boolean boolean2 = RegExpMatcher.matches("11hi!", "hi!1a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test024");
        boolean boolean2 = RegExpMatcher.matches("hi!", "a11");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test025");
        String str2 = RegExpMatcher.makeConcatenation("hi!1a", "hi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!1ahi!aa" + "'", str2.equals("hi!1ahi!aa"));
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test026");
        String str2 = RegExpMatcher.makeConcatenation("11hi!", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "11hi!" + "'", str2.equals("11hi!"));
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test027");
        boolean boolean2 = RegExpMatcher.matches("aa", "11hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test028");
        String str2 = RegExpMatcher.makeConcatenation("a", "hi!1a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "ahi!1a" + "'", str2.equals("ahi!1a"));
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test029");
        String str2 = RegExpMatcher.makeConcatenation("hi!1a", "11hi!11");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!1a11hi!11" + "'", str2.equals("hi!1a11hi!11"));
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test030");
        String str2 = RegExpMatcher.makeConcatenation("11hi!", "1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "11hi!1" + "'", str2.equals("11hi!1"));
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test031");
        boolean boolean2 = RegExpMatcher.matches("a11", "a11");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test032");
        boolean boolean2 = RegExpMatcher.matches("11hi!", "hi!1a11hi!11");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test033");
        boolean boolean2 = RegExpMatcher.matches("11", "aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test034");
        boolean boolean2 = RegExpMatcher.matches("a11", "hi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test035");
        String str2 = RegExpMatcher.makeConcatenation("hi!1a", "hi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!1ahi!1ahi!aa" + "'", str2.equals("hi!1ahi!1ahi!aa"));
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test036");
        boolean boolean2 = RegExpMatcher.matches("aa", "hi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test037");
        String str2 = RegExpMatcher.makeConcatenation("hi!1a11hi!11", "aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!1a11hi!11aa" + "'", str2.equals("hi!1a11hi!11aa"));
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test038");
        boolean boolean2 = RegExpMatcher.matches("ahi!1a", "a11");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test039");
        boolean boolean2 = RegExpMatcher.matches("hi!1a", "aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test040");
        String str2 = RegExpMatcher.makeConcatenation("11hi!", "11hi!1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "11hi!11hi!1" + "'", str2.equals("11hi!11hi!1"));
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test041");
        String str2 = RegExpMatcher.makeConcatenation("hi!1a11hi!11", "hi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!1a11hi!11hi!1ahi!aa" + "'", str2.equals("hi!1a11hi!11hi!1ahi!aa"));
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test042");
        String str2 = RegExpMatcher.makeConcatenation("", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test043");
        String str2 = RegExpMatcher.makeConcatenation("11hi!11", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "11hi!11" + "'", str2.equals("11hi!11"));
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test044");
        boolean boolean2 = RegExpMatcher.matches("11hi!11hi!1", "hi!1a11hi!11");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test045");
        String str2 = RegExpMatcher.makeConcatenation("hi!1a11hi!11aa", "hi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!1a11hi!11aahi!1ahi!aa" + "'", str2.equals("hi!1a11hi!11aahi!1ahi!aa"));
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test046");
        String str2 = RegExpMatcher.makeConcatenation("1a", "ahi!1a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1aahi!1a" + "'", str2.equals("1aahi!1a"));
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test047");
        String str2 = RegExpMatcher.makeConcatenation("hi!", "hi!1a11hi!11aahi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!hi!1a11hi!11aahi!1ahi!aa" + "'", str2.equals("hi!hi!1a11hi!11aahi!1ahi!aa"));
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test048");
        boolean boolean2 = RegExpMatcher.matches("1a", "a11");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test049");
        String str2 = RegExpMatcher.makeConcatenation("1a", "hi!1a11hi!11aahi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1ahi!1a11hi!11aahi!1ahi!aa" + "'", str2.equals("1ahi!1a11hi!11aahi!1ahi!aa"));
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test050");
        String str2 = RegExpMatcher.makeConcatenation("11hi!1", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "11hi!1" + "'", str2.equals("11hi!1"));
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test051");
        boolean boolean2 = RegExpMatcher.matches("a", "hi!1a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test052");
        boolean boolean2 = RegExpMatcher.matches("aa", "11hi!11");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test053");
        String str2 = RegExpMatcher.makeConcatenation("1a", "11hi!1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1a11hi!1" + "'", str2.equals("1a11hi!1"));
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test054");
        boolean boolean2 = RegExpMatcher.matches("hi!1a11hi!11", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test055");
        String str2 = RegExpMatcher.makeConcatenation("11hi!", "ahi!1a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "11hi!ahi!1a" + "'", str2.equals("11hi!ahi!1a"));
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test056");
        String str2 = RegExpMatcher.makeConcatenation("", "11");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "11" + "'", str2.equals("11"));
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test057");
        boolean boolean2 = RegExpMatcher.matches("hi!1a", "hi!1a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test058");
        String str2 = RegExpMatcher.makeConcatenation("hi!1ahi!aa", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!1ahi!aa" + "'", str2.equals("hi!1ahi!aa"));
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test059");
        String str2 = RegExpMatcher.makeConcatenation("hi!1a", "hi!hi!1a11hi!11aahi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!1ahi!hi!1a11hi!11aahi!1ahi!aa" + "'", str2.equals("hi!1ahi!hi!1a11hi!11aahi!1ahi!aa"));
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test060");
        boolean boolean2 = RegExpMatcher.matches("hi!1a11hi!11hi!1ahi!aa", "hi!1a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test061");
        String str2 = RegExpMatcher.makeConcatenation("a11", "1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a111" + "'", str2.equals("a111"));
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test062");
        String str2 = RegExpMatcher.makeConcatenation("hi!1a11hi!11", "hi!1a11hi!11");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!1a11hi!11hi!1a11hi!11" + "'", str2.equals("hi!1a11hi!11hi!1a11hi!11"));
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test063");
        boolean boolean2 = RegExpMatcher.matches("hi!aa", "1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test064");
        String str2 = RegExpMatcher.makeConcatenation("1a11hi!1", "a11");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1a11hi!1a11" + "'", str2.equals("1a11hi!1a11"));
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test065");
        String str2 = RegExpMatcher.makeConcatenation("11", "hi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "11hi!aa" + "'", str2.equals("11hi!aa"));
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test066");
        String str2 = RegExpMatcher.makeConcatenation("hi!1a11hi!11hi!1a11hi!11", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!1a11hi!11hi!1a11hi!11hi!" + "'", str2.equals("hi!1a11hi!11hi!1a11hi!11hi!"));
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test067");
        String str2 = RegExpMatcher.makeConcatenation("hi!1a11hi!11", "hi!1ahi!hi!1a11hi!11aahi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!1a11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa" + "'", str2.equals("hi!1a11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa"));
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test068");
        boolean boolean2 = RegExpMatcher.matches("1ahi!1a11hi!11aahi!1ahi!aa", "1ahi!1a11hi!11aahi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test069");
        boolean boolean2 = RegExpMatcher.matches("11", "a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test070");
        String str2 = RegExpMatcher.makeConcatenation("hi!1ahi!hi!1a11hi!11aahi!1ahi!aa", "aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa" + "'", str2.equals("hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa"));
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test071");
        boolean boolean2 = RegExpMatcher.matches("1a", "hi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test072");
        boolean boolean2 = RegExpMatcher.matches("11", "hi!1a11hi!11aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test073");
        String str2 = RegExpMatcher.makeConcatenation("hi!1a", "1ahi!1a11hi!11aahi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!1a1ahi!1a11hi!11aahi!1ahi!aa" + "'", str2.equals("hi!1a1ahi!1a11hi!11aahi!1ahi!aa"));
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test074");
        String str2 = RegExpMatcher.makeConcatenation("a11", "hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa" + "'", str2.equals("a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa"));
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test075");
        boolean boolean2 = RegExpMatcher.matches("11hi!ahi!1a", "1a11hi!1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test076");
        boolean boolean2 = RegExpMatcher.matches("hi!1a11hi!11hi!1a11hi!11", "hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test077");
        String str2 = RegExpMatcher.makeConcatenation("1aahi!1a", "hi!1a1ahi!1a11hi!11aahi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aa" + "'", str2.equals("1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aa"));
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test078");
        boolean boolean2 = RegExpMatcher.matches("hi!1a", "11hi!11hi!1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test079");
        String str2 = RegExpMatcher.makeConcatenation("aa", "a11");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "aaa11" + "'", str2.equals("aaa11"));
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test080");
        boolean boolean2 = RegExpMatcher.matches("11hi!", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test081");
        boolean boolean2 = RegExpMatcher.matches("hi!1a11hi!11hi!1a11hi!11hi!", "hi!1ahi!hi!1a11hi!11aahi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test082");
        boolean boolean2 = RegExpMatcher.matches("aa", "hi!1a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test083");
        String str2 = RegExpMatcher.makeConcatenation("1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aa", "11hi!11hi!1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aa11hi!11hi!1" + "'", str2.equals("1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aa11hi!11hi!1"));
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test084");
        boolean boolean2 = RegExpMatcher.matches("hi!1a11hi!11hi!1a11hi!11hi!", "hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test085");
        String str2 = RegExpMatcher.makeConcatenation("1aahi!1a", "hi!1a11hi!11aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1aahi!1ahi!1a11hi!11aa" + "'", str2.equals("1aahi!1ahi!1a11hi!11aa"));
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test086");
        boolean boolean2 = RegExpMatcher.matches("a11", "aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test087");
        boolean boolean2 = RegExpMatcher.matches("hi!1a11hi!11aa", "a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test088");
        boolean boolean2 = RegExpMatcher.matches("aa", "hi!1ahi!hi!1a11hi!11aahi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test089");
        String str2 = RegExpMatcher.makeConcatenation("1a11hi!1a11", "11hi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1a11hi!1a1111hi!aa" + "'", str2.equals("1a11hi!1a1111hi!aa"));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test090");
        boolean boolean2 = RegExpMatcher.matches("1", "1a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test091");
        boolean boolean2 = RegExpMatcher.matches("hi!1a", "hi!1a11hi!11hi!1a11hi!11hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test092");
        String str2 = RegExpMatcher.makeConcatenation("11hi!", "hi!1a1ahi!1a11hi!11aahi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aa" + "'", str2.equals("11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aa"));
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test093");
        boolean boolean2 = RegExpMatcher.matches("11hi!ahi!1a", "11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test094");
        String str2 = RegExpMatcher.makeConcatenation("hi!1a11hi!11hi!1ahi!aa", "a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!1a11hi!11hi!1ahi!aaa" + "'", str2.equals("hi!1a11hi!11hi!1ahi!aaa"));
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test095");
        String str2 = RegExpMatcher.makeConcatenation("hi!1a11hi!11hi!1a11hi!11", "a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!1a11hi!11hi!1a11hi!11a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa" + "'", str2.equals("hi!1a11hi!11hi!1a11hi!11a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa"));
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test096");
        String str2 = RegExpMatcher.makeConcatenation("hi!1a11hi!11hi!1ahi!aaa", "hi!1a11hi!11hi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!1a11hi!11hi!1ahi!aaahi!1a11hi!11hi!1ahi!aa" + "'", str2.equals("hi!1a11hi!11hi!1ahi!aaahi!1a11hi!11hi!1ahi!aa"));
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test097");
        boolean boolean2 = RegExpMatcher.matches("11hi!1", "hi!1ahi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test098");
        boolean boolean2 = RegExpMatcher.matches("hi!hi!1a11hi!11aahi!1ahi!aa", "1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test099");
        boolean boolean2 = RegExpMatcher.matches("hi!1a11hi!11aa", "1a11hi!1a11");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test100");
        String str2 = RegExpMatcher.makeConcatenation("a11", "1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aa" + "'", str2.equals("a111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aa"));
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test101");
        String str2 = RegExpMatcher.makeConcatenation("11hi!1", "hi!1ahi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "11hi!1hi!1ahi!1ahi!aa" + "'", str2.equals("11hi!1hi!1ahi!1ahi!aa"));
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test102");
        boolean boolean2 = RegExpMatcher.matches("aa", "aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test103");
        String str2 = RegExpMatcher.makeConcatenation("hi!1a11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa", "hi!1a11hi!11hi!1a11hi!11hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!1a11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aahi!1a11hi!11hi!1a11hi!11hi!" + "'", str2.equals("hi!1a11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aahi!1a11hi!11hi!1a11hi!11hi!"));
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test104");
        String str2 = RegExpMatcher.makeConcatenation("1", "hi!1a11hi!11aahi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1hi!1a11hi!11aahi!1ahi!aa" + "'", str2.equals("1hi!1a11hi!11aahi!1ahi!aa"));
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test105");
        boolean boolean2 = RegExpMatcher.matches("1a11hi!1a1111hi!aa", "1aahi!1ahi!1a11hi!11aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test106");
        boolean boolean2 = RegExpMatcher.matches("ahi!1a", "hi!1a11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aahi!1a11hi!11hi!1a11hi!11hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test107");
        boolean boolean2 = RegExpMatcher.matches("hi!1ahi!hi!1a11hi!11aahi!1ahi!aa", "11hi!11hi!1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test108");
        String str2 = RegExpMatcher.makeConcatenation("hi!1a11hi!11hi!1a11hi!11hi!", "1a11hi!1a11");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!1a11hi!11hi!1a11hi!11hi!1a11hi!1a11" + "'", str2.equals("hi!1a11hi!11hi!1a11hi!11hi!1a11hi!1a11"));
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test109");
        String str2 = RegExpMatcher.makeConcatenation("1aahi!1ahi!1a11hi!11aa", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1aahi!1ahi!1a11hi!11aa" + "'", str2.equals("1aahi!1ahi!1a11hi!11aa"));
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test110");
        boolean boolean2 = RegExpMatcher.matches("", "aaa11");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test111");
        String str2 = RegExpMatcher.makeConcatenation("hi!1a11hi!11hi!1ahi!aa", "11hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!1a11hi!11hi!1ahi!aa11hi!" + "'", str2.equals("hi!1a11hi!11hi!1ahi!aa11hi!"));
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test112");
        boolean boolean2 = RegExpMatcher.matches("hi!1a11hi!11hi!1a11hi!11hi!", "11hi!11hi!1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test113");
        String str2 = RegExpMatcher.makeConcatenation("", "hi!1a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!1a" + "'", str2.equals("hi!1a"));
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test114");
        boolean boolean2 = RegExpMatcher.matches("hi!1a11hi!11hi!1a11hi!11hi!", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test115");
        boolean boolean2 = RegExpMatcher.matches("hi!", "1a11hi!1a1111hi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test116");
        boolean boolean2 = RegExpMatcher.matches("hi!1a11hi!11hi!1a11hi!11hi!", "11hi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test117");
        boolean boolean2 = RegExpMatcher.matches("1hi!1a11hi!11aahi!1ahi!aa", "a11");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test118");
        String str2 = RegExpMatcher.makeConcatenation("11hi!1hi!1ahi!1ahi!aa", "11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "11hi!1hi!1ahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aa" + "'", str2.equals("11hi!1hi!1ahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aa"));
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test119");
        boolean boolean2 = RegExpMatcher.matches("hi!hi!1a11hi!11aahi!1ahi!aa", "11hi!1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test120");
        String str2 = RegExpMatcher.makeConcatenation("11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aa", "hi!1a11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa" + "'", str2.equals("11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa"));
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test121");
        boolean boolean2 = RegExpMatcher.matches("ahi!1a", "11hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test122");
        String str2 = RegExpMatcher.makeConcatenation("11hi!11hi!1", "a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "11hi!11hi!1a" + "'", str2.equals("11hi!11hi!1a"));
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test123");
        String str2 = RegExpMatcher.makeConcatenation("11hi!ahi!1a", "hi!1a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "11hi!ahi!1ahi!1a" + "'", str2.equals("11hi!ahi!1ahi!1a"));
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test124");
        String str2 = RegExpMatcher.makeConcatenation("1aahi!1a", "hi!1a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1aahi!1ahi!1a" + "'", str2.equals("1aahi!1ahi!1a"));
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test125");
        String str2 = RegExpMatcher.makeConcatenation("hi!1a11hi!11hi!1ahi!aaa", "hi!1a11hi!11hi!1a11hi!11hi!1a11hi!1a11");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!1a11hi!11hi!1ahi!aaahi!1a11hi!11hi!1a11hi!11hi!1a11hi!1a11" + "'", str2.equals("hi!1a11hi!11hi!1ahi!aaahi!1a11hi!11hi!1a11hi!11hi!1a11hi!1a11"));
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test126");
        String str2 = RegExpMatcher.makeConcatenation("hi!1a11hi!11hi!1a11hi!11a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa", "1hi!1a11hi!11aahi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!1a11hi!11hi!1a11hi!11a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa1hi!1a11hi!11aahi!1ahi!aa" + "'", str2.equals("hi!1a11hi!11hi!1a11hi!11a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa1hi!1a11hi!11aahi!1ahi!aa"));
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test127");
        String str2 = RegExpMatcher.makeConcatenation("11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aa", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!" + "'", str2.equals("11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!"));
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test128");
        String str2 = RegExpMatcher.makeConcatenation("1aahi!1ahi!1a11hi!11aa", "1aahi!1ahi!1a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1aahi!1ahi!1a11hi!11aa1aahi!1ahi!1a" + "'", str2.equals("1aahi!1ahi!1a11hi!11aa1aahi!1ahi!1a"));
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test129");
        String str2 = RegExpMatcher.makeConcatenation("11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!", "hi!1a11hi!11hi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!hi!1a11hi!11hi!1ahi!aa" + "'", str2.equals("11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!hi!1a11hi!11hi!1ahi!aa"));
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test130");
        boolean boolean2 = RegExpMatcher.matches("hi!1a11hi!11hi!1ahi!aaahi!1a11hi!11hi!1a11hi!11hi!1a11hi!1a11", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test131");
        String str2 = RegExpMatcher.makeConcatenation("hi!1a11hi!11aahi!1ahi!aa", "11hi!11hi!1a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!1a11hi!11aahi!1ahi!aa11hi!11hi!1a" + "'", str2.equals("hi!1a11hi!11aahi!1ahi!aa11hi!11hi!1a"));
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test132");
        boolean boolean2 = RegExpMatcher.matches("hi!1ahi!hi!1a11hi!11aahi!1ahi!aa", "11hi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test133");
        boolean boolean2 = RegExpMatcher.matches("hi!1a11hi!11aahi!1ahi!aa", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test134");
        boolean boolean2 = RegExpMatcher.matches("1a11hi!1a1111hi!aa", "1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aa11hi!11hi!1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test135");
        String str2 = RegExpMatcher.makeConcatenation("", "11hi!1hi!1ahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "11hi!1hi!1ahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aa" + "'", str2.equals("11hi!1hi!1ahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aa"));
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test136");
        boolean boolean2 = RegExpMatcher.matches("11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aa", "hi!1a11hi!11aahi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test137");
        String str2 = RegExpMatcher.makeConcatenation("hi!1a11hi!11hi!1a11hi!11hi!1a11hi!1a11", "hi!1a11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!1a11hi!11hi!1a11hi!11hi!1a11hi!1a11hi!1a11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa" + "'", str2.equals("hi!1a11hi!11hi!1a11hi!11hi!1a11hi!1a11hi!1a11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa"));
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test138");
        boolean boolean2 = RegExpMatcher.matches("a111", "1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test139");
        String str2 = RegExpMatcher.makeConcatenation("1", "hi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1hi!1ahi!aa" + "'", str2.equals("1hi!1ahi!aa"));
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test140");
        String str2 = RegExpMatcher.makeConcatenation("11hi!ahi!1ahi!1a", "11hi!1hi!1ahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "11hi!ahi!1ahi!1a11hi!1hi!1ahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aa" + "'", str2.equals("11hi!ahi!1ahi!1a11hi!1hi!1ahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aa"));
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test141");
        boolean boolean2 = RegExpMatcher.matches("hi!1a11hi!11hi!1ahi!aa", "11hi!ahi!1ahi!1a11hi!1hi!1ahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test142");
        boolean boolean2 = RegExpMatcher.matches("hi!1a11hi!11hi!1ahi!aa", "hi!1a11hi!11");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test143");
        String str2 = RegExpMatcher.makeConcatenation("1hi!1a11hi!11aahi!1ahi!aa", "11hi!ahi!1a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1hi!1a11hi!11aahi!1ahi!aa11hi!ahi!1a" + "'", str2.equals("1hi!1a11hi!11aahi!1ahi!aa11hi!ahi!1a"));
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test144");
        String str2 = RegExpMatcher.makeConcatenation("hi!1a11hi!11hi!1ahi!aaa", "hi!1a11hi!11hi!1ahi!aaa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!1a11hi!11hi!1ahi!aaahi!1a11hi!11hi!1ahi!aaa" + "'", str2.equals("hi!1a11hi!11hi!1ahi!aaahi!1a11hi!11hi!1ahi!aaa"));
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test145");
        boolean boolean2 = RegExpMatcher.matches("", "1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test146");
        String str2 = RegExpMatcher.makeConcatenation("a111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aa", "hi!1a11hi!11aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11aa" + "'", str2.equals("a111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11aa"));
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test147");
        boolean boolean2 = RegExpMatcher.matches("", "hi!1a11hi!11hi!1ahi!aaahi!1a11hi!11hi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test148");
        boolean boolean2 = RegExpMatcher.matches("11hi!ahi!1ahi!1a11hi!1hi!1ahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aa", "hi!1a11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aahi!1a11hi!11hi!1a11hi!11hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test149");
        boolean boolean2 = RegExpMatcher.matches("hi!1a11hi!11hi!1a11hi!11hi!", "11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!hi!1a11hi!11hi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test150");
        boolean boolean2 = RegExpMatcher.matches("hi!1a11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aahi!1a11hi!11hi!1a11hi!11hi!", "hi!1a11hi!11aahi!1ahi!aa11hi!11hi!1a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test151");
        String str2 = RegExpMatcher.makeConcatenation("hi!1a11hi!11hi!1a11hi!11hi!", "aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!1a11hi!11hi!1a11hi!11hi!aa" + "'", str2.equals("hi!1a11hi!11hi!1a11hi!11hi!aa"));
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test152");
        String str2 = RegExpMatcher.makeConcatenation("", "1hi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1hi!1ahi!aa" + "'", str2.equals("1hi!1ahi!aa"));
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test153");
        boolean boolean2 = RegExpMatcher.matches("1a11hi!1a11", "hi!1a11hi!11hi!1ahi!aa11hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test154");
        boolean boolean2 = RegExpMatcher.matches("1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aa", "a111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test155");
        boolean boolean2 = RegExpMatcher.matches("11hi!1", "hi!1a11hi!11hi!1a11hi!11");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test156");
        String str2 = RegExpMatcher.makeConcatenation("11hi!11", "1ahi!1a11hi!11aahi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "11hi!111ahi!1a11hi!11aahi!1ahi!aa" + "'", str2.equals("11hi!111ahi!1a11hi!11aahi!1ahi!aa"));
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test157");
        boolean boolean2 = RegExpMatcher.matches("11hi!1", "hi!1a11hi!11");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test158");
        boolean boolean2 = RegExpMatcher.matches("aa", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test159");
        boolean boolean2 = RegExpMatcher.matches("hi!1a1ahi!1a11hi!11aahi!1ahi!aa", "11hi!ahi!1ahi!1a11hi!1hi!1ahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test160");
        boolean boolean2 = RegExpMatcher.matches("1aahi!1a", "hi!1a11hi!11hi!1a11hi!11a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa1hi!1a11hi!11aahi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test161");
        boolean boolean2 = RegExpMatcher.matches("1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aa", "1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test162");
        boolean boolean2 = RegExpMatcher.matches("a11", "ahi!1a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test163");
        String str2 = RegExpMatcher.makeConcatenation("hi!1ahi!1ahi!aa", "1a11hi!1a11");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!1ahi!1ahi!aa1a11hi!1a11" + "'", str2.equals("hi!1ahi!1ahi!aa1a11hi!1a11"));
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test164");
        boolean boolean2 = RegExpMatcher.matches("hi!1a11hi!11hi!1ahi!aaa", "11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!hi!1a11hi!11hi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test165");
        String str2 = RegExpMatcher.makeConcatenation("11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!hi!1a11hi!11hi!1ahi!aa", "hi!1a11hi!11hi!1a11hi!11a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!hi!1a11hi!11hi!1ahi!aahi!1a11hi!11hi!1a11hi!11a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa" + "'", str2.equals("11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!hi!1a11hi!11hi!1ahi!aahi!1a11hi!11hi!1a11hi!11a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa"));
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test166");
        String str2 = RegExpMatcher.makeConcatenation("11hi!1hi!1ahi!1ahi!aa", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "11hi!1hi!1ahi!1ahi!aahi!" + "'", str2.equals("11hi!1hi!1ahi!1ahi!aahi!"));
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test167");
        String str2 = RegExpMatcher.makeConcatenation("1a11hi!1", "11hi!1hi!1ahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1a11hi!111hi!1hi!1ahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aa" + "'", str2.equals("1a11hi!111hi!1hi!1ahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aa"));
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test168");
        boolean boolean2 = RegExpMatcher.matches("hi!1a11hi!11hi!1ahi!aaahi!1a11hi!11hi!1ahi!aa", "hi!1a1ahi!1a11hi!11aahi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test169");
        String str2 = RegExpMatcher.makeConcatenation("11hi!aa", "11hi!11hi!1a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "11hi!aa11hi!11hi!1a" + "'", str2.equals("11hi!aa11hi!11hi!1a"));
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test170");
        String str2 = RegExpMatcher.makeConcatenation("1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aa", "hi!1a11hi!11aahi!1ahi!aa11hi!11hi!1a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11aahi!1ahi!aa11hi!11hi!1a" + "'", str2.equals("1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11aahi!1ahi!aa11hi!11hi!1a"));
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test171");
        String str2 = RegExpMatcher.makeConcatenation("hi!aa", "hi!1a11hi!11hi!1ahi!aaahi!1a11hi!11hi!1a11hi!11hi!1a11hi!1a11");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!aahi!1a11hi!11hi!1ahi!aaahi!1a11hi!11hi!1a11hi!11hi!1a11hi!1a11" + "'", str2.equals("hi!aahi!1a11hi!11hi!1ahi!aaahi!1a11hi!11hi!1a11hi!11hi!1a11hi!1a11"));
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test172");
        String str2 = RegExpMatcher.makeConcatenation("a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa", "hi!1a11hi!11aahi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaahi!1a11hi!11aahi!1ahi!aa" + "'", str2.equals("a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaahi!1a11hi!11aahi!1ahi!aa"));
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test173");
        boolean boolean2 = RegExpMatcher.matches("11hi!1hi!1ahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aa", "11hi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test174");
        boolean boolean2 = RegExpMatcher.matches("hi!1a11hi!11hi!1ahi!aaa", "hi!1a11hi!11hi!1a11hi!11a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa1hi!1a11hi!11aahi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test175");
        boolean boolean2 = RegExpMatcher.matches("hi!1ahi!hi!1a11hi!11aahi!1ahi!aa", "hi!1a11hi!11hi!1a11hi!11");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test176");
        boolean boolean2 = RegExpMatcher.matches("hi!1ahi!hi!1a11hi!11aahi!1ahi!aa", "hi!1a11hi!11hi!1a11hi!11hi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test177");
        String str2 = RegExpMatcher.makeConcatenation("hi!1a11hi!11hi!1a11hi!11hi!1a11hi!1a11hi!1a11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa", "1hi!1a11hi!11aahi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!1a11hi!11hi!1a11hi!11hi!1a11hi!1a11hi!1a11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa1hi!1a11hi!11aahi!1ahi!aa" + "'", str2.equals("hi!1a11hi!11hi!1a11hi!11hi!1a11hi!1a11hi!1a11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa1hi!1a11hi!11aahi!1ahi!aa"));
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test178");
        boolean boolean2 = RegExpMatcher.matches("a11", "1a11hi!1a1111hi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test179");
        boolean boolean2 = RegExpMatcher.matches("11hi!1hi!1ahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aa", "a111");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test180");
        boolean boolean2 = RegExpMatcher.matches("hi!", "hi!1a11hi!11");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test181");
        String str2 = RegExpMatcher.makeConcatenation("1aahi!1ahi!1a11hi!11aa1aahi!1ahi!1a", "11hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1aahi!1ahi!1a11hi!11aa1aahi!1ahi!1a11hi!" + "'", str2.equals("1aahi!1ahi!1a11hi!11aa1aahi!1ahi!1a11hi!"));
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test182");
        String str2 = RegExpMatcher.makeConcatenation("11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!hi!1a11hi!11hi!1ahi!aa", "11hi!1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!hi!1a11hi!11hi!1ahi!aa11hi!1" + "'", str2.equals("11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!hi!1a11hi!11hi!1ahi!aa11hi!1"));
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test183");
        String str2 = RegExpMatcher.makeConcatenation("", "11hi!111ahi!1a11hi!11aahi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "11hi!111ahi!1a11hi!11aahi!1ahi!aa" + "'", str2.equals("11hi!111ahi!1a11hi!11aahi!1ahi!aa"));
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test184");
        boolean boolean2 = RegExpMatcher.matches("hi!1a11hi!11hi!1ahi!aa11hi!", "1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test185");
        String str2 = RegExpMatcher.makeConcatenation("11hi!1hi!1ahi!1ahi!aa", "1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11aahi!1ahi!aa11hi!11hi!1a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "11hi!1hi!1ahi!1ahi!aa1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11aahi!1ahi!aa11hi!11hi!1a" + "'", str2.equals("11hi!1hi!1ahi!1ahi!aa1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11aahi!1ahi!aa11hi!11hi!1a"));
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test186");
        boolean boolean2 = RegExpMatcher.matches("11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aa", "hi!1a11hi!11hi!1a11hi!11");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test187");
        boolean boolean2 = RegExpMatcher.matches("11hi!aa", "11hi!1hi!1ahi!1ahi!aahi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test188");
        String str2 = RegExpMatcher.makeConcatenation("11hi!1hi!1ahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aa", "hi!1a11hi!11aahi!1ahi!aa11hi!11hi!1a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "11hi!1hi!1ahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11aahi!1ahi!aa11hi!11hi!1a" + "'", str2.equals("11hi!1hi!1ahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11aahi!1ahi!aa11hi!11hi!1a"));
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test189");
        boolean boolean2 = RegExpMatcher.matches("hi!1a11hi!11hi!1a11hi!11hi!aa", "1a11hi!1a11");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test190");
        boolean boolean2 = RegExpMatcher.matches("11hi!1", "a111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test191");
        String str2 = RegExpMatcher.makeConcatenation("hi!1a11hi!11hi!1a11hi!11hi!aa", "hi!aahi!1a11hi!11hi!1ahi!aaahi!1a11hi!11hi!1a11hi!11hi!1a11hi!1a11");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!1a11hi!11hi!1a11hi!11hi!aahi!aahi!1a11hi!11hi!1ahi!aaahi!1a11hi!11hi!1a11hi!11hi!1a11hi!1a11" + "'", str2.equals("hi!1a11hi!11hi!1a11hi!11hi!aahi!aahi!1a11hi!11hi!1ahi!aaahi!1a11hi!11hi!1a11hi!11hi!1a11hi!1a11"));
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test192");
        boolean boolean2 = RegExpMatcher.matches("11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aa", "11hi!1hi!1ahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11aahi!1ahi!aa11hi!11hi!1a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test193");
        boolean boolean2 = RegExpMatcher.matches("11hi!11hi!1a", "1aahi!1a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test194");
        boolean boolean2 = RegExpMatcher.matches("hi!1a11hi!11hi!1ahi!aaahi!1a11hi!11hi!1a11hi!11hi!1a11hi!1a11", "11hi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test195");
        boolean boolean2 = RegExpMatcher.matches("a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaahi!1a11hi!11aahi!1ahi!aa", "aaa11");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test196");
        boolean boolean2 = RegExpMatcher.matches("11hi!ahi!1ahi!1a", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test197");
        String str2 = RegExpMatcher.makeConcatenation("1a11hi!111hi!1hi!1ahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aa", "11hi!11");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1a11hi!111hi!1hi!1ahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aa11hi!11" + "'", str2.equals("1a11hi!111hi!1hi!1ahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aa11hi!11"));
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test198");
        boolean boolean2 = RegExpMatcher.matches("hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa", "11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test199");
        boolean boolean2 = RegExpMatcher.matches("", "a111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test200");
        boolean boolean2 = RegExpMatcher.matches("hi!1a11hi!11hi!1ahi!aa11hi!", "a11");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test201");
        boolean boolean2 = RegExpMatcher.matches("11hi!aa11hi!11hi!1a", "hi!aahi!1a11hi!11hi!1ahi!aaahi!1a11hi!11hi!1a11hi!11hi!1a11hi!1a11");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test202");
        String str2 = RegExpMatcher.makeConcatenation("1a11hi!111hi!1hi!1ahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aa", "a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaahi!1a11hi!11aahi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1a11hi!111hi!1hi!1ahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aaa11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaahi!1a11hi!11aahi!1ahi!aa" + "'", str2.equals("1a11hi!111hi!1hi!1ahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aaa11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaahi!1a11hi!11aahi!1ahi!aa"));
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test203");
        String str2 = RegExpMatcher.makeConcatenation("11", "hi!1a11hi!11hi!1a11hi!11");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "11hi!1a11hi!11hi!1a11hi!11" + "'", str2.equals("11hi!1a11hi!11hi!1a11hi!11"));
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test204");
        boolean boolean2 = RegExpMatcher.matches("1hi!1ahi!aa", "1aahi!1ahi!1a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test205");
        boolean boolean2 = RegExpMatcher.matches("hi!1a1ahi!1a11hi!11aahi!1ahi!aa", "hi!1a11hi!11aahi!1ahi!aa11hi!11hi!1a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test206");
        boolean boolean2 = RegExpMatcher.matches("a111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aa", "11hi!11hi!1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test207");
        boolean boolean2 = RegExpMatcher.matches("11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa", "hi!1a11hi!11hi!1a11hi!11a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa1hi!1a11hi!11aahi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test208");
        boolean boolean2 = RegExpMatcher.matches("1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aa", "hi!1a11hi!11hi!1a11hi!11hi!1a11hi!1a11");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test209");
        boolean boolean2 = RegExpMatcher.matches("a111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aa", "11hi!1hi!1ahi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test210");
        String str2 = RegExpMatcher.makeConcatenation("hi!1a11hi!11hi!1a11hi!11a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa1hi!1a11hi!11aahi!1ahi!aa", "11hi!aa11hi!11hi!1a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!1a11hi!11hi!1a11hi!11a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa1hi!1a11hi!11aahi!1ahi!aa11hi!aa11hi!11hi!1a" + "'", str2.equals("hi!1a11hi!11hi!1a11hi!11a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa1hi!1a11hi!11aahi!1ahi!aa11hi!aa11hi!11hi!1a"));
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test211");
        String str2 = RegExpMatcher.makeConcatenation("1aahi!1ahi!1a11hi!11aa1aahi!1ahi!1a", "1aahi!1ahi!1a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1aahi!1ahi!1a11hi!11aa1aahi!1ahi!1a1aahi!1ahi!1a" + "'", str2.equals("1aahi!1ahi!1a11hi!11aa1aahi!1ahi!1a1aahi!1ahi!1a"));
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test212");
        String str2 = RegExpMatcher.makeConcatenation("hi!aahi!1a11hi!11hi!1ahi!aaahi!1a11hi!11hi!1a11hi!11hi!1a11hi!1a11", "a11");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!aahi!1a11hi!11hi!1ahi!aaahi!1a11hi!11hi!1a11hi!11hi!1a11hi!1a11a11" + "'", str2.equals("hi!aahi!1a11hi!11hi!1ahi!aaahi!1a11hi!11hi!1a11hi!11hi!1a11hi!1a11a11"));
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test213");
        String str2 = RegExpMatcher.makeConcatenation("11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!", "1a11hi!111hi!1hi!1ahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aa11hi!11");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!111hi!1hi!1ahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aa11hi!11" + "'", str2.equals("11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!111hi!1hi!1ahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aa11hi!11"));
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test214");
        String str2 = RegExpMatcher.makeConcatenation("", "hi!1a11hi!11hi!1a11hi!11a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa1hi!1a11hi!11aahi!1ahi!aa11hi!aa11hi!11hi!1a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!1a11hi!11hi!1a11hi!11a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa1hi!1a11hi!11aahi!1ahi!aa11hi!aa11hi!11hi!1a" + "'", str2.equals("hi!1a11hi!11hi!1a11hi!11a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa1hi!1a11hi!11aahi!1ahi!aa11hi!aa11hi!11hi!1a"));
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test215");
        String str2 = RegExpMatcher.makeConcatenation("hi!1a1ahi!1a11hi!11aahi!1ahi!aa", "1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!1a1ahi!1a11hi!11aahi!1ahi!aa1" + "'", str2.equals("hi!1a1ahi!1a11hi!11aahi!1ahi!aa1"));
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test216");
        String str2 = RegExpMatcher.makeConcatenation("hi!1ahi!1ahi!aa1a11hi!1a11", "11hi!1hi!1ahi!1ahi!aahi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!1ahi!1ahi!aa1a11hi!1a1111hi!1hi!1ahi!1ahi!aahi!" + "'", str2.equals("hi!1ahi!1ahi!aa1a11hi!1a1111hi!1hi!1ahi!1ahi!aahi!"));
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test217");
        boolean boolean2 = RegExpMatcher.matches("11hi!", "11hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test218");
        boolean boolean2 = RegExpMatcher.matches("11hi!11hi!1a", "1a11hi!111hi!1hi!1ahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aa11hi!11");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test219");
        boolean boolean2 = RegExpMatcher.matches("hi!1a11hi!11hi!1a11hi!11hi!", "hi!1a11hi!11hi!1ahi!aaahi!1a11hi!11hi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test220");
        String str2 = RegExpMatcher.makeConcatenation("hi!1ahi!aa", "a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!1ahi!aaa11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa" + "'", str2.equals("hi!1ahi!aaa11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa"));
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test221");
        String str2 = RegExpMatcher.makeConcatenation("hi!1a11hi!11aahi!1ahi!aa", "a11");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!1a11hi!11aahi!1ahi!aaa11" + "'", str2.equals("hi!1a11hi!11aahi!1ahi!aaa11"));
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test222");
        boolean boolean2 = RegExpMatcher.matches("a111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aa", "a111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test223");
        String str2 = RegExpMatcher.makeConcatenation("hi!1a11hi!11hi!1a11hi!11a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa1hi!1a11hi!11aahi!1ahi!aa11hi!aa11hi!11hi!1a", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!1a11hi!11hi!1a11hi!11a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa1hi!1a11hi!11aahi!1ahi!aa11hi!aa11hi!11hi!1a" + "'", str2.equals("hi!1a11hi!11hi!1a11hi!11a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa1hi!1a11hi!11aahi!1ahi!aa11hi!aa11hi!11hi!1a"));
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test224");
        boolean boolean2 = RegExpMatcher.matches("hi!1a11hi!11hi!1a11hi!11hi!", "11");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test225");
        String str2 = RegExpMatcher.makeConcatenation("hi!1a11hi!11hi!1a11hi!11a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa1hi!1a11hi!11aahi!1ahi!aa11hi!aa11hi!11hi!1a", "hi!hi!1a11hi!11aahi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!1a11hi!11hi!1a11hi!11a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa1hi!1a11hi!11aahi!1ahi!aa11hi!aa11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa" + "'", str2.equals("hi!1a11hi!11hi!1a11hi!11a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa1hi!1a11hi!11aahi!1ahi!aa11hi!aa11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa"));
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test226");
        String str2 = RegExpMatcher.makeConcatenation("11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa", "11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!hi!1a11hi!11hi!1ahi!aa11hi!1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!hi!1a11hi!11hi!1ahi!aa11hi!1" + "'", str2.equals("11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!hi!1a11hi!11hi!1ahi!aa11hi!1"));
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test227");
        boolean boolean2 = RegExpMatcher.matches("11hi!1hi!1ahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aa", "11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test228");
        boolean boolean2 = RegExpMatcher.matches("1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aa11hi!11hi!1", "hi!1a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test229");
        boolean boolean2 = RegExpMatcher.matches("", "hi!1a11hi!11hi!1ahi!aa11hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test230");
        String str2 = RegExpMatcher.makeConcatenation("1aahi!1ahi!1a11hi!11aa", "hi!1a11hi!11");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1aahi!1ahi!1a11hi!11aahi!1a11hi!11" + "'", str2.equals("1aahi!1ahi!1a11hi!11aahi!1a11hi!11"));
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test231");
        String str2 = RegExpMatcher.makeConcatenation("hi!1ahi!hi!1a11hi!11aahi!1ahi!aa", "1a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!1ahi!hi!1a11hi!11aahi!1ahi!aa1a" + "'", str2.equals("hi!1ahi!hi!1a11hi!11aahi!1ahi!aa1a"));
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test232");
        String str2 = RegExpMatcher.makeConcatenation("11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa", "hi!1a11hi!11hi!1a11hi!11a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa1hi!1a11hi!11aahi!1ahi!aa11hi!aa11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aahi!1a11hi!11hi!1a11hi!11a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa1hi!1a11hi!11aahi!1ahi!aa11hi!aa11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa" + "'", str2.equals("11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aahi!1a11hi!11hi!1a11hi!11a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa1hi!1a11hi!11aahi!1ahi!aa11hi!aa11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa"));
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test233");
        boolean boolean2 = RegExpMatcher.matches("hi!1a1ahi!1a11hi!11aahi!1ahi!aa1", "11hi!aa11hi!11hi!1a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test234");
        String str2 = RegExpMatcher.makeConcatenation("1aahi!1ahi!1a11hi!11aa", "a111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1aahi!1ahi!1a11hi!11aaa111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aa" + "'", str2.equals("1aahi!1ahi!1a11hi!11aaa111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aa"));
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test235");
        boolean boolean2 = RegExpMatcher.matches("1a11hi!1a11", "hi!1a1ahi!1a11hi!11aahi!1ahi!aa1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test236");
        String str2 = RegExpMatcher.makeConcatenation("hi!hi!1a11hi!11aahi!1ahi!aa", "a111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!hi!1a11hi!11aahi!1ahi!aaa111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aa" + "'", str2.equals("hi!hi!1a11hi!11aahi!1ahi!aaa111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aa"));
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test237");
        String str2 = RegExpMatcher.makeConcatenation("hi!1a11hi!11", "hi!1ahi!hi!1a11hi!11aahi!1ahi!aa1a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!1a11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa1a" + "'", str2.equals("hi!1a11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa1a"));
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test238");
        String str2 = RegExpMatcher.makeConcatenation("a111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aa", "a111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aaa111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aa" + "'", str2.equals("a111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aaa111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aa"));
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test239");
        String str2 = RegExpMatcher.makeConcatenation("aaa11", "hi!1a11hi!11hi!1a11hi!11hi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "aaa11hi!1a11hi!11hi!1a11hi!11hi!aa" + "'", str2.equals("aaa11hi!1a11hi!11hi!1a11hi!11hi!aa"));
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test240");
        String str2 = RegExpMatcher.makeConcatenation("hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa", "11hi!11");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa11hi!11" + "'", str2.equals("hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa11hi!11"));
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test241");
        boolean boolean2 = RegExpMatcher.matches("hi!aahi!1a11hi!11hi!1ahi!aaahi!1a11hi!11hi!1a11hi!11hi!1a11hi!1a11a11", "hi!1a11hi!11hi!1a11hi!11hi!1a11hi!1a11");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test242");
        boolean boolean2 = RegExpMatcher.matches("11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aa", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test243");
        String str2 = RegExpMatcher.makeConcatenation("11hi!1hi!1ahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aa", "11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!hi!1a11hi!11hi!1ahi!aa11hi!1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "11hi!1hi!1ahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!hi!1a11hi!11hi!1ahi!aa11hi!1" + "'", str2.equals("11hi!1hi!1ahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!hi!1a11hi!11hi!1ahi!aa11hi!1"));
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test244");
        boolean boolean2 = RegExpMatcher.matches("11hi!11", "11hi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test245");
        boolean boolean2 = RegExpMatcher.matches("a111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aa", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test246");
        boolean boolean2 = RegExpMatcher.matches("hi!1a11hi!11hi!1ahi!aaahi!1a11hi!11hi!1a11hi!11hi!1a11hi!1a11", "a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test247");
        boolean boolean2 = RegExpMatcher.matches("hi!1a11hi!11hi!1a11hi!11", "11hi!1hi!1ahi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test248");
        boolean boolean2 = RegExpMatcher.matches("1aahi!1ahi!1a11hi!11aa", "11hi!1hi!1ahi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test249");
        String str2 = RegExpMatcher.makeConcatenation("hi!1a11hi!11aahi!1ahi!aa11hi!11hi!1a", "a111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!1a11hi!11aahi!1ahi!aa11hi!11hi!1aa111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aa" + "'", str2.equals("hi!1a11hi!11aahi!1ahi!aa11hi!11hi!1aa111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aa"));
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test250");
        String str2 = RegExpMatcher.makeConcatenation("a111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11aa", "1a11hi!111hi!1hi!1ahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11aa1a11hi!111hi!1hi!1ahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aa" + "'", str2.equals("a111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11aa1a11hi!111hi!1hi!1ahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aa"));
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test251");
        String str2 = RegExpMatcher.makeConcatenation("11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa", "11hi!11hi!1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa11hi!11hi!1" + "'", str2.equals("11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa11hi!11hi!1"));
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test252");
        boolean boolean2 = RegExpMatcher.matches("hi!1ahi!aaa11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa", "hi!hi!1a11hi!11aahi!1ahi!aaa111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test253");
        boolean boolean2 = RegExpMatcher.matches("11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!hi!1a11hi!11hi!1ahi!aa11hi!1", "1aahi!1ahi!1a11hi!11aahi!1a11hi!11");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test254");
        String str2 = RegExpMatcher.makeConcatenation("hi!1ahi!hi!1a11hi!11aahi!1ahi!aa", "a111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aaa111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!1ahi!hi!1a11hi!11aahi!1ahi!aaa111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aaa111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aa" + "'", str2.equals("hi!1ahi!hi!1a11hi!11aahi!1ahi!aaa111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aaa111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aa"));
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test255");
        String str2 = RegExpMatcher.makeConcatenation("11hi!11", "1a11hi!111hi!1hi!1ahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "11hi!111a11hi!111hi!1hi!1ahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aa" + "'", str2.equals("11hi!111a11hi!111hi!1hi!1ahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aa"));
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test256");
        boolean boolean2 = RegExpMatcher.matches("hi!1a11hi!11hi!1a11hi!11hi!aa", "1a11hi!1a1111hi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test257");
        boolean boolean2 = RegExpMatcher.matches("1a11hi!1a1111hi!aa", "11hi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test258");
        boolean boolean2 = RegExpMatcher.matches("aa", "hi!1a11hi!11hi!1a11hi!11hi!1a11hi!1a11hi!1a11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa1hi!1a11hi!11aahi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test259");
        boolean boolean2 = RegExpMatcher.matches("a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaahi!1a11hi!11aahi!1ahi!aa", "11");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test260");
        boolean boolean2 = RegExpMatcher.matches("1hi!1a11hi!11aahi!1ahi!aa11hi!ahi!1a", "1aahi!1ahi!1a11hi!11aa1aahi!1ahi!1a1aahi!1ahi!1a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test261");
        boolean boolean2 = RegExpMatcher.matches("hi!1a11hi!11hi!1ahi!aaahi!1a11hi!11hi!1ahi!aa", "hi!1ahi!1ahi!aa1a11hi!1a1111hi!1hi!1ahi!1ahi!aahi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test262");
        boolean boolean2 = RegExpMatcher.matches("11hi!ahi!1ahi!1a", "1hi!1a11hi!11aahi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test263");
        boolean boolean2 = RegExpMatcher.matches("hi!1a11hi!11hi!1ahi!aa11hi!", "11hi!1hi!1ahi!1ahi!aa1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11aahi!1ahi!aa11hi!11hi!1a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test264");
        String str2 = RegExpMatcher.makeConcatenation("hi!1ahi!1ahi!aa1a11hi!1a1111hi!1hi!1ahi!1ahi!aahi!", "1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aa11hi!11hi!1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!1ahi!1ahi!aa1a11hi!1a1111hi!1hi!1ahi!1ahi!aahi!1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aa11hi!11hi!1" + "'", str2.equals("hi!1ahi!1ahi!aa1a11hi!1a1111hi!1hi!1ahi!1ahi!aahi!1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aa11hi!11hi!1"));
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test265");
        String str2 = RegExpMatcher.makeConcatenation("hi!1a11hi!11hi!1ahi!aa11hi!", "11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!1a11hi!11hi!1ahi!aa11hi!11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aa" + "'", str2.equals("hi!1a11hi!11hi!1ahi!aa11hi!11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aa"));
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test266");
        boolean boolean2 = RegExpMatcher.matches("hi!1ahi!1ahi!aa1a11hi!1a1111hi!1hi!1ahi!1ahi!aahi!", "hi!1ahi!1ahi!aa1a11hi!1a11");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test267");
        String str2 = RegExpMatcher.makeConcatenation("hi!1a11hi!11hi!1a11hi!11", "11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!1a11hi!11hi!1a11hi!1111hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa" + "'", str2.equals("hi!1a11hi!11hi!1a11hi!1111hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa"));
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test268");
        String str2 = RegExpMatcher.makeConcatenation("hi!1ahi!1ahi!aa", "1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11aahi!1ahi!aa11hi!11hi!1a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!1ahi!1ahi!aa1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11aahi!1ahi!aa11hi!11hi!1a" + "'", str2.equals("hi!1ahi!1ahi!aa1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11aahi!1ahi!aa11hi!11hi!1a"));
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test269");
        String str2 = RegExpMatcher.makeConcatenation("hi!1ahi!aaa11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa", "11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!1ahi!aaa11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aa" + "'", str2.equals("hi!1ahi!aaa11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aa"));
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test270");
        String str2 = RegExpMatcher.makeConcatenation("11hi!", "hi!1a11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "11hi!hi!1a11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa" + "'", str2.equals("11hi!hi!1a11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa"));
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test271");
        boolean boolean2 = RegExpMatcher.matches("11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa", "1hi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test272");
        String str2 = RegExpMatcher.makeConcatenation("hi!", "hi!1ahi!1ahi!aa1a11hi!1a1111hi!1hi!1ahi!1ahi!aahi!1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aa11hi!11hi!1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!hi!1ahi!1ahi!aa1a11hi!1a1111hi!1hi!1ahi!1ahi!aahi!1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aa11hi!11hi!1" + "'", str2.equals("hi!hi!1ahi!1ahi!aa1a11hi!1a1111hi!1hi!1ahi!1ahi!aahi!1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aa11hi!11hi!1"));
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test273");
        String str2 = RegExpMatcher.makeConcatenation("hi!1a11hi!11hi!1ahi!aaahi!1a11hi!11hi!1ahi!aa", "11hi!11");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!1a11hi!11hi!1ahi!aaahi!1a11hi!11hi!1ahi!aa11hi!11" + "'", str2.equals("hi!1a11hi!11hi!1ahi!aaahi!1a11hi!11hi!1ahi!aa11hi!11"));
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test274");
        String str2 = RegExpMatcher.makeConcatenation("1aahi!1ahi!1a11hi!11aa1aahi!1ahi!1a1aahi!1ahi!1a", "hi!1ahi!aaa11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1aahi!1ahi!1a11hi!11aa1aahi!1ahi!1a1aahi!1ahi!1ahi!1ahi!aaa11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aa" + "'", str2.equals("1aahi!1ahi!1a11hi!11aa1aahi!1ahi!1a1aahi!1ahi!1ahi!1ahi!aaa11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aa"));
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test275");
        String str2 = RegExpMatcher.makeConcatenation("hi!1a11hi!11aahi!1ahi!aaa11", "11hi!ahi!1a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!1a11hi!11aahi!1ahi!aaa1111hi!ahi!1a" + "'", str2.equals("hi!1a11hi!11aahi!1ahi!aaa1111hi!ahi!1a"));
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test276");
        boolean boolean2 = RegExpMatcher.matches("hi!1a11hi!11hi!1ahi!aaahi!1a11hi!11hi!1ahi!aa11hi!11", "hi!1ahi!1ahi!aa1a11hi!1a1111hi!1hi!1ahi!1ahi!aahi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test277");
        boolean boolean2 = RegExpMatcher.matches("aaa11hi!1a11hi!11hi!1a11hi!11hi!aa", "1a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test278");
        String str2 = RegExpMatcher.makeConcatenation("aaa11", "11hi!1hi!1ahi!1ahi!aa1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11aahi!1ahi!aa11hi!11hi!1a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "aaa1111hi!1hi!1ahi!1ahi!aa1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11aahi!1ahi!aa11hi!11hi!1a" + "'", str2.equals("aaa1111hi!1hi!1ahi!1ahi!aa1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11aahi!1ahi!aa11hi!11hi!1a"));
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test279");
        String str2 = RegExpMatcher.makeConcatenation("1aahi!1ahi!1a11hi!11aa", "hi!1a11hi!11hi!1ahi!aa11hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1aahi!1ahi!1a11hi!11aahi!1a11hi!11hi!1ahi!aa11hi!" + "'", str2.equals("1aahi!1ahi!1a11hi!11aahi!1a11hi!11hi!1ahi!aa11hi!"));
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test280");
        String str2 = RegExpMatcher.makeConcatenation("hi!hi!1a11hi!11aahi!1ahi!aa", "11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aahi!1a11hi!11hi!1a11hi!11a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa1hi!1a11hi!11aahi!1ahi!aa11hi!aa11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!hi!1a11hi!11aahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aahi!1a11hi!11hi!1a11hi!11a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa1hi!1a11hi!11aahi!1ahi!aa11hi!aa11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa" + "'", str2.equals("hi!hi!1a11hi!11aahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aahi!1a11hi!11hi!1a11hi!11a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa1hi!1a11hi!11aahi!1ahi!aa11hi!aa11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa"));
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test281");
        boolean boolean2 = RegExpMatcher.matches("11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!hi!1a11hi!11hi!1ahi!aahi!1a11hi!11hi!1a11hi!11a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa", "11hi!11hi!1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test282");
        String str2 = RegExpMatcher.makeConcatenation("1", "hi!1a11hi!11aahi!1ahi!aa11hi!11hi!1aa111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1hi!1a11hi!11aahi!1ahi!aa11hi!11hi!1aa111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aa" + "'", str2.equals("1hi!1a11hi!11aahi!1ahi!aa11hi!11hi!1aa111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aa"));
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test283");
        String str2 = RegExpMatcher.makeConcatenation("1hi!1a11hi!11aahi!1ahi!aa11hi!11hi!1aa111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aa", "hi!1a11hi!11hi!1a11hi!11hi!1a11hi!1a11");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1hi!1a11hi!11aahi!1ahi!aa11hi!11hi!1aa111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11hi!1a11hi!11hi!1a11hi!1a11" + "'", str2.equals("1hi!1a11hi!11aahi!1ahi!aa11hi!11hi!1aa111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11hi!1a11hi!11hi!1a11hi!1a11"));
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test284");
        boolean boolean2 = RegExpMatcher.matches("11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aahi!1a11hi!11hi!1a11hi!11a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa1hi!1a11hi!11aahi!1ahi!aa11hi!aa11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa", "aaa11");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test285");
        boolean boolean2 = RegExpMatcher.matches("hi!1ahi!aaa11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aa", "11hi!ahi!1a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test286");
        String str2 = RegExpMatcher.makeConcatenation("11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!111hi!1hi!1ahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aa11hi!11", "11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!hi!1a11hi!11hi!1ahi!aa11hi!1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!111hi!1hi!1ahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aa11hi!1111hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!hi!1a11hi!11hi!1ahi!aa11hi!1" + "'", str2.equals("11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!111hi!1hi!1ahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aa11hi!1111hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!hi!1a11hi!11hi!1ahi!aa11hi!1"));
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test287");
        boolean boolean2 = RegExpMatcher.matches("", "a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaahi!1a11hi!11aahi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test288");
        String str2 = RegExpMatcher.makeConcatenation("1a11hi!1", "1aahi!1ahi!1a11hi!11aa1aahi!1ahi!1a1aahi!1ahi!1a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1a11hi!11aahi!1ahi!1a11hi!11aa1aahi!1ahi!1a1aahi!1ahi!1a" + "'", str2.equals("1a11hi!11aahi!1ahi!1a11hi!11aa1aahi!1ahi!1a1aahi!1ahi!1a"));
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test289");
        String str2 = RegExpMatcher.makeConcatenation("1aahi!1a", "a11");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1aahi!1aa11" + "'", str2.equals("1aahi!1aa11"));
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test290");
        boolean boolean2 = RegExpMatcher.matches("11hi!111ahi!1a11hi!11aahi!1ahi!aa", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test291");
        boolean boolean2 = RegExpMatcher.matches("11hi!111a11hi!111hi!1hi!1ahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aa", "11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!hi!1a11hi!11hi!1ahi!aa11hi!1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test292");
        boolean boolean2 = RegExpMatcher.matches("hi!1a11hi!11", "11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!hi!1a11hi!11hi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test293");
        boolean boolean2 = RegExpMatcher.matches("11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa11hi!11hi!1", "hi!1a11hi!11");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test294");
        String str2 = RegExpMatcher.makeConcatenation("hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa", "hi!1a1ahi!1a11hi!11aahi!1ahi!aa1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaahi!1a1ahi!1a11hi!11aahi!1ahi!aa1" + "'", str2.equals("hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaahi!1a1ahi!1a11hi!11aahi!1ahi!aa1"));
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test295");
        String str2 = RegExpMatcher.makeConcatenation("11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!", "hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa" + "'", str2.equals("11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa"));
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test296");
        String str2 = RegExpMatcher.makeConcatenation("11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!111hi!1hi!1ahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aa11hi!1111hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!hi!1a11hi!11hi!1ahi!aa11hi!1", "hi!1a11hi!11hi!1ahi!aaa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!111hi!1hi!1ahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aa11hi!1111hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!hi!1a11hi!11hi!1ahi!aa11hi!1hi!1a11hi!11hi!1ahi!aaa" + "'", str2.equals("11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!111hi!1hi!1ahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aa11hi!1111hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!hi!1a11hi!11hi!1ahi!aa11hi!1hi!1a11hi!11hi!1ahi!aaa"));
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test297");
        boolean boolean2 = RegExpMatcher.matches("", "1a11hi!1a1111hi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test298");
        String str2 = RegExpMatcher.makeConcatenation("hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa", "hi!1a11hi!11hi!1a11hi!11a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa1hi!1a11hi!11aahi!1ahi!aa11hi!aa11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaahi!1a11hi!11hi!1a11hi!11a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa1hi!1a11hi!11aahi!1ahi!aa11hi!aa11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa" + "'", str2.equals("hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaahi!1a11hi!11hi!1a11hi!11a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa1hi!1a11hi!11aahi!1ahi!aa11hi!aa11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa"));
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test299");
        String str2 = RegExpMatcher.makeConcatenation("hi!1ahi!1ahi!aa1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11aahi!1ahi!aa11hi!11hi!1a", "hi!1a11hi!11hi!1a11hi!11a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa1hi!1a11hi!11aahi!1ahi!aa11hi!aa11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!1ahi!1ahi!aa1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11aahi!1ahi!aa11hi!11hi!1ahi!1a11hi!11hi!1a11hi!11a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa1hi!1a11hi!11aahi!1ahi!aa11hi!aa11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa" + "'", str2.equals("hi!1ahi!1ahi!aa1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11aahi!1ahi!aa11hi!11hi!1ahi!1a11hi!11hi!1a11hi!11a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa1hi!1a11hi!11aahi!1ahi!aa11hi!aa11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa"));
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test300");
        String str2 = RegExpMatcher.makeConcatenation("11hi!1", "1hi!1a11hi!11aahi!1ahi!aa11hi!11hi!1aa111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "11hi!11hi!1a11hi!11aahi!1ahi!aa11hi!11hi!1aa111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aa" + "'", str2.equals("11hi!11hi!1a11hi!11aahi!1ahi!aa11hi!11hi!1aa111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aa"));
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test301");
        String str2 = RegExpMatcher.makeConcatenation("aaa11", "1aahi!1ahi!1a11hi!11aa1aahi!1ahi!1a11hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "aaa111aahi!1ahi!1a11hi!11aa1aahi!1ahi!1a11hi!" + "'", str2.equals("aaa111aahi!1ahi!1a11hi!11aa1aahi!1ahi!1a11hi!"));
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test302");
        String str2 = RegExpMatcher.makeConcatenation("", "hi!1a11hi!11aahi!1ahi!aaa1111hi!ahi!1a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!1a11hi!11aahi!1ahi!aaa1111hi!ahi!1a" + "'", str2.equals("hi!1a11hi!11aahi!1ahi!aaa1111hi!ahi!1a"));
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test303");
        boolean boolean2 = RegExpMatcher.matches("11hi!1", "1a11hi!111hi!1hi!1ahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aaa11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaahi!1a11hi!11aahi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test304");
        String str2 = RegExpMatcher.makeConcatenation("hi!1ahi!hi!1a11hi!11aahi!1ahi!aa1a", "11hi!hi!1a11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!1ahi!hi!1a11hi!11aahi!1ahi!aa1a11hi!hi!1a11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa" + "'", str2.equals("hi!1ahi!hi!1a11hi!11aahi!1ahi!aa1a11hi!hi!1a11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa"));
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test305");
        boolean boolean2 = RegExpMatcher.matches("1aahi!1ahi!1a11hi!11aa1aahi!1ahi!1a1aahi!1ahi!1ahi!1ahi!aaa11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aa", "hi!1a11hi!11hi!1a11hi!11a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa1hi!1a11hi!11aahi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test306");
        boolean boolean2 = RegExpMatcher.matches("hi!aa", "aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test307");
        boolean boolean2 = RegExpMatcher.matches("1hi!1a11hi!11aahi!1ahi!aa", "11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!hi!1a11hi!11hi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test308");
        boolean boolean2 = RegExpMatcher.matches("hi!1a11hi!11hi!1a11hi!11hi!aahi!aahi!1a11hi!11hi!1ahi!aaahi!1a11hi!11hi!1a11hi!11hi!1a11hi!1a11", "11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!hi!1a11hi!11hi!1ahi!aahi!1a11hi!11hi!1a11hi!11a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test309");
        String str2 = RegExpMatcher.makeConcatenation("hi!1a11hi!11hi!1ahi!aaahi!1a11hi!11hi!1ahi!aa11hi!11", "aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!1a11hi!11hi!1ahi!aaahi!1a11hi!11hi!1ahi!aa11hi!11aa" + "'", str2.equals("hi!1a11hi!11hi!1ahi!aaahi!1a11hi!11hi!1ahi!aa11hi!11aa"));
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test310");
        boolean boolean2 = RegExpMatcher.matches("aaa11", "aaa11hi!1a11hi!11hi!1a11hi!11hi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test311");
        String str2 = RegExpMatcher.makeConcatenation("11hi!aa11hi!11hi!1a", "1ahi!1a11hi!11aahi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "11hi!aa11hi!11hi!1a1ahi!1a11hi!11aahi!1ahi!aa" + "'", str2.equals("11hi!aa11hi!11hi!1a1ahi!1a11hi!11aahi!1ahi!aa"));
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test312");
        String str2 = RegExpMatcher.makeConcatenation("hi!1a1ahi!1a11hi!11aahi!1ahi!aa1", "hi!1a11hi!11hi!1a11hi!11a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa1hi!1a11hi!11aahi!1ahi!aa11hi!aa11hi!11hi!1a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!1a1ahi!1a11hi!11aahi!1ahi!aa1hi!1a11hi!11hi!1a11hi!11a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa1hi!1a11hi!11aahi!1ahi!aa11hi!aa11hi!11hi!1a" + "'", str2.equals("hi!1a1ahi!1a11hi!11aahi!1ahi!aa1hi!1a11hi!11hi!1a11hi!11a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa1hi!1a11hi!11aahi!1ahi!aa11hi!aa11hi!11hi!1a"));
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test313");
        boolean boolean2 = RegExpMatcher.matches("hi!1a11hi!11hi!1ahi!aaahi!1a11hi!11hi!1a11hi!11hi!1a11hi!1a11", "a111");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test314");
        boolean boolean2 = RegExpMatcher.matches("1a11hi!111hi!1hi!1ahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aa", "hi!1a11hi!11aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test315");
        boolean boolean2 = RegExpMatcher.matches("hi!1ahi!1ahi!aa", "hi!1a11hi!11hi!1a11hi!11hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test316");
        boolean boolean2 = RegExpMatcher.matches("hi!1a11hi!11hi!1ahi!aaahi!1a11hi!11hi!1ahi!aa11hi!11", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test317");
        boolean boolean2 = RegExpMatcher.matches("", "hi!1a11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa1a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test318");
        String str2 = RegExpMatcher.makeConcatenation("11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa11hi!11hi!1", "11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!hi!1a11hi!11hi!1ahi!aa11hi!1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa11hi!11hi!111hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!hi!1a11hi!11hi!1ahi!aa11hi!1" + "'", str2.equals("11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa11hi!11hi!111hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!hi!1a11hi!11hi!1ahi!aa11hi!1"));
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test319");
        String str2 = RegExpMatcher.makeConcatenation("11hi!aa", "1a11hi!1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "11hi!aa1a11hi!1" + "'", str2.equals("11hi!aa1a11hi!1"));
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test320");
        String str2 = RegExpMatcher.makeConcatenation("1aahi!1ahi!1a11hi!11aa1aahi!1ahi!1a1aahi!1ahi!1ahi!1ahi!aaa11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aa", "hi!1ahi!aaa11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1aahi!1ahi!1a11hi!11aa1aahi!1ahi!1a1aahi!1ahi!1ahi!1ahi!aaa11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1ahi!aaa11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aa" + "'", str2.equals("1aahi!1ahi!1a11hi!11aa1aahi!1ahi!1a1aahi!1ahi!1ahi!1ahi!aaa11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1ahi!aaa11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aa"));
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test321");
        boolean boolean2 = RegExpMatcher.matches("", "hi!1ahi!1ahi!aa1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11aahi!1ahi!aa11hi!11hi!1ahi!1a11hi!11hi!1a11hi!11a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa1hi!1a11hi!11aahi!1ahi!aa11hi!aa11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test322");
        String str2 = RegExpMatcher.makeConcatenation("a111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aaa111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aa", "hi!1a11hi!11hi!1a11hi!11hi!aahi!aahi!1a11hi!11hi!1ahi!aaahi!1a11hi!11hi!1a11hi!11hi!1a11hi!1a11");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aaa111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11hi!1a11hi!11hi!aahi!aahi!1a11hi!11hi!1ahi!aaahi!1a11hi!11hi!1a11hi!11hi!1a11hi!1a11" + "'", str2.equals("a111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aaa111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11hi!1a11hi!11hi!aahi!aahi!1a11hi!11hi!1ahi!aaahi!1a11hi!11hi!1a11hi!11hi!1a11hi!1a11"));
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test323");
        String str2 = RegExpMatcher.makeConcatenation("hi!1a11hi!11hi!1ahi!aa11hi!", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!1a11hi!11hi!1ahi!aa11hi!" + "'", str2.equals("hi!1a11hi!11hi!1ahi!aa11hi!"));
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test324");
        String str2 = RegExpMatcher.makeConcatenation("hi!aa", "hi!1a11hi!11aahi!1ahi!aaa11");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!aahi!1a11hi!11aahi!1ahi!aaa11" + "'", str2.equals("hi!aahi!1a11hi!11aahi!1ahi!aaa11"));
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test325");
        String str2 = RegExpMatcher.makeConcatenation("hi!1a1ahi!1a11hi!11aahi!1ahi!aa1", "11hi!1hi!1ahi!1ahi!aa1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11aahi!1ahi!aa11hi!11hi!1a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!1a1ahi!1a11hi!11aahi!1ahi!aa111hi!1hi!1ahi!1ahi!aa1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11aahi!1ahi!aa11hi!11hi!1a" + "'", str2.equals("hi!1a1ahi!1a11hi!11aahi!1ahi!aa111hi!1hi!1ahi!1ahi!aa1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11aahi!1ahi!aa11hi!11hi!1a"));
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test326");
        boolean boolean2 = RegExpMatcher.matches("11hi!11hi!1", "hi!1a11hi!11hi!1ahi!aaahi!1a11hi!11hi!1ahi!aaa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test327");
        boolean boolean2 = RegExpMatcher.matches("11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aahi!1a11hi!11hi!1a11hi!11a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa1hi!1a11hi!11aahi!1ahi!aa11hi!aa11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa", "11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!hi!1a11hi!11hi!1ahi!aahi!1a11hi!11hi!1a11hi!11a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test328");
        String str2 = RegExpMatcher.makeConcatenation("hi!1ahi!hi!1a11hi!11aahi!1ahi!aa1a11hi!hi!1a11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa", "1aahi!1a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!1ahi!hi!1a11hi!11aahi!1ahi!aa1a11hi!hi!1a11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa1aahi!1a" + "'", str2.equals("hi!1ahi!hi!1a11hi!11aahi!1ahi!aa1a11hi!hi!1a11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa1aahi!1a"));
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test329");
        String str2 = RegExpMatcher.makeConcatenation("11hi!1hi!1ahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aa", "hi!aahi!1a11hi!11hi!1ahi!aaahi!1a11hi!11hi!1a11hi!11hi!1a11hi!1a11");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "11hi!1hi!1ahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!aahi!1a11hi!11hi!1ahi!aaahi!1a11hi!11hi!1a11hi!11hi!1a11hi!1a11" + "'", str2.equals("11hi!1hi!1ahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!aahi!1a11hi!11hi!1ahi!aaahi!1a11hi!11hi!1a11hi!11hi!1a11hi!1a11"));
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test330");
        String str2 = RegExpMatcher.makeConcatenation("11hi!1hi!1ahi!1ahi!aa1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11aahi!1ahi!aa11hi!11hi!1a", "11hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "11hi!1hi!1ahi!1ahi!aa1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11aahi!1ahi!aa11hi!11hi!1a11hi!" + "'", str2.equals("11hi!1hi!1ahi!1ahi!aa1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11aahi!1ahi!aa11hi!11hi!1a11hi!"));
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test331");
        boolean boolean2 = RegExpMatcher.matches("hi!1a11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa", "hi!1ahi!1ahi!aa1a11hi!1a1111hi!1hi!1ahi!1ahi!aahi!1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aa11hi!11hi!1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test332");
        boolean boolean2 = RegExpMatcher.matches("hi!1ahi!1ahi!aa1a11hi!1a1111hi!1hi!1ahi!1ahi!aahi!", "1aahi!1ahi!1a11hi!11aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test333");
        String str2 = RegExpMatcher.makeConcatenation("a111", "11hi!111ahi!1a11hi!11aahi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a11111hi!111ahi!1a11hi!11aahi!1ahi!aa" + "'", str2.equals("a11111hi!111ahi!1a11hi!11aahi!1ahi!aa"));
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test334");
        boolean boolean2 = RegExpMatcher.matches("11hi!1hi!1ahi!1ahi!aa1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11aahi!1ahi!aa11hi!11hi!1a11hi!", "hi!1a11hi!11aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test335");
        boolean boolean2 = RegExpMatcher.matches("11hi!1a11hi!11hi!1a11hi!11", "hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaahi!1a1ahi!1a11hi!11aahi!1ahi!aa1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test336");
        boolean boolean2 = RegExpMatcher.matches("11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa11hi!11hi!111hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!hi!1a11hi!11hi!1ahi!aa11hi!1", "1a11hi!111hi!1hi!1ahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aa11hi!11");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test337");
        String str2 = RegExpMatcher.makeConcatenation("hi!1a11hi!11hi!1ahi!aaa", "1hi!1a11hi!11aahi!1ahi!aa11hi!ahi!1a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!1a11hi!11hi!1ahi!aaa1hi!1a11hi!11aahi!1ahi!aa11hi!ahi!1a" + "'", str2.equals("hi!1a11hi!11hi!1ahi!aaa1hi!1a11hi!11aahi!1ahi!aa11hi!ahi!1a"));
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test338");
        boolean boolean2 = RegExpMatcher.matches("hi!1a11hi!11hi!1a11hi!11a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa1hi!1a11hi!11aahi!1ahi!aa", "1a11hi!1a11");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test339");
        boolean boolean2 = RegExpMatcher.matches("11hi!aa11hi!11hi!1a", "11hi!1hi!1ahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test340");
        String str2 = RegExpMatcher.makeConcatenation("hi!1a11hi!11hi!1a11hi!11a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa", "hi!1a11hi!11hi!1a11hi!11a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa1hi!1a11hi!11aahi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!1a11hi!11hi!1a11hi!11a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaahi!1a11hi!11hi!1a11hi!11a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa1hi!1a11hi!11aahi!1ahi!aa" + "'", str2.equals("hi!1a11hi!11hi!1a11hi!11a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaahi!1a11hi!11hi!1a11hi!11a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa1hi!1a11hi!11aahi!1ahi!aa"));
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test341");
        String str2 = RegExpMatcher.makeConcatenation("", "1aahi!1ahi!1a11hi!11aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1aahi!1ahi!1a11hi!11aa" + "'", str2.equals("1aahi!1ahi!1a11hi!11aa"));
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test342");
        boolean boolean2 = RegExpMatcher.matches("1aahi!1aa11", "1hi!1a11hi!11aahi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test343");
        boolean boolean2 = RegExpMatcher.matches("hi!1a11hi!11hi!1ahi!aaahi!1a11hi!11hi!1ahi!aa11hi!11", "11hi!aa1a11hi!1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test344");
        String str2 = RegExpMatcher.makeConcatenation("11hi!1hi!1ahi!1ahi!aa1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11aahi!1ahi!aa11hi!11hi!1a11hi!", "hi!1ahi!1ahi!aa1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11aahi!1ahi!aa11hi!11hi!1a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "11hi!1hi!1ahi!1ahi!aa1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11aahi!1ahi!aa11hi!11hi!1a11hi!hi!1ahi!1ahi!aa1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11aahi!1ahi!aa11hi!11hi!1a" + "'", str2.equals("11hi!1hi!1ahi!1ahi!aa1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11aahi!1ahi!aa11hi!11hi!1a11hi!hi!1ahi!1ahi!aa1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11aahi!1ahi!aa11hi!11hi!1a"));
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test345");
        boolean boolean2 = RegExpMatcher.matches("hi!1ahi!hi!1a11hi!11aahi!1ahi!aa", "1hi!1a11hi!11aahi!1ahi!aa11hi!11hi!1aa111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11hi!1a11hi!11hi!1a11hi!1a11");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test346");
        boolean boolean2 = RegExpMatcher.matches("1a11hi!111hi!1hi!1ahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aa11hi!11", "1aahi!1ahi!1a11hi!11aa1aahi!1ahi!1a11hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test347");
        boolean boolean2 = RegExpMatcher.matches("11hi!aa", "11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!hi!1a11hi!11hi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test348");
        boolean boolean2 = RegExpMatcher.matches("11hi!11", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test349");
        String str2 = RegExpMatcher.makeConcatenation("11hi!ahi!1a", "hi!1a11hi!11hi!1ahi!aaahi!1a11hi!11hi!1a11hi!11hi!1a11hi!1a11");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "11hi!ahi!1ahi!1a11hi!11hi!1ahi!aaahi!1a11hi!11hi!1a11hi!11hi!1a11hi!1a11" + "'", str2.equals("11hi!ahi!1ahi!1a11hi!11hi!1ahi!aaahi!1a11hi!11hi!1a11hi!11hi!1a11hi!1a11"));
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test350");
        boolean boolean2 = RegExpMatcher.matches("1a11hi!111hi!1hi!1ahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aa", "11hi!aa11hi!11hi!1a1ahi!1a11hi!11aahi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test351");
        String str2 = RegExpMatcher.makeConcatenation("1aahi!1ahi!1a11hi!11aa1aahi!1ahi!1a1aahi!1ahi!1ahi!1ahi!aaa11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1ahi!aaa11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aa", "11hi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1aahi!1ahi!1a11hi!11aa1aahi!1ahi!1a1aahi!1ahi!1ahi!1ahi!aaa11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1ahi!aaa11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aa11hi!aa" + "'", str2.equals("1aahi!1ahi!1a11hi!11aa1aahi!1ahi!1a1aahi!1ahi!1ahi!1ahi!aaa11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1ahi!aaa11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aa11hi!aa"));
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test352");
        String str2 = RegExpMatcher.makeConcatenation("11hi!", "11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!hi!1a11hi!11hi!1ahi!aa11hi!1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "11hi!11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!hi!1a11hi!11hi!1ahi!aa11hi!1" + "'", str2.equals("11hi!11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!hi!1a11hi!11hi!1ahi!aa11hi!1"));
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test353");
        String str2 = RegExpMatcher.makeConcatenation("11hi!1hi!1ahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11aahi!1ahi!aa11hi!11hi!1a", "hi!1a11hi!11aahi!1ahi!aaa11");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "11hi!1hi!1ahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11aahi!1ahi!aa11hi!11hi!1ahi!1a11hi!11aahi!1ahi!aaa11" + "'", str2.equals("11hi!1hi!1ahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11aahi!1ahi!aa11hi!11hi!1ahi!1a11hi!11aahi!1ahi!aaa11"));
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test354");
        String str2 = RegExpMatcher.makeConcatenation("hi!1a11hi!11hi!1a11hi!11a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaahi!1a11hi!11hi!1a11hi!11a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa1hi!1a11hi!11aahi!1ahi!aa", "hi!1a11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!1a11hi!11hi!1a11hi!11a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaahi!1a11hi!11hi!1a11hi!11a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa1hi!1a11hi!11aahi!1ahi!aahi!1a11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa" + "'", str2.equals("hi!1a11hi!11hi!1a11hi!11a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaahi!1a11hi!11hi!1a11hi!11a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa1hi!1a11hi!11aahi!1ahi!aahi!1a11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa"));
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test355");
        boolean boolean2 = RegExpMatcher.matches("hi!1a", "hi!1a11hi!11hi!1a11hi!11a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa1hi!1a11hi!11aahi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test356");
        String str2 = RegExpMatcher.makeConcatenation("1aahi!1ahi!1a11hi!11aahi!1a11hi!11hi!1ahi!aa11hi!", "a11");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1aahi!1ahi!1a11hi!11aahi!1a11hi!11hi!1ahi!aa11hi!a11" + "'", str2.equals("1aahi!1ahi!1a11hi!11aahi!1a11hi!11hi!1ahi!aa11hi!a11"));
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test357");
        String str2 = RegExpMatcher.makeConcatenation("a11", "hi!1a11hi!11hi!1ahi!aa11hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a11hi!1a11hi!11hi!1ahi!aa11hi!" + "'", str2.equals("a11hi!1a11hi!11hi!1ahi!aa11hi!"));
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test358");
        boolean boolean2 = RegExpMatcher.matches("1aahi!1ahi!1a11hi!11aahi!1a11hi!11hi!1ahi!aa11hi!a11", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test359");
        String str2 = RegExpMatcher.makeConcatenation("a", "a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaahi!1a11hi!11aahi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "aa11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaahi!1a11hi!11aahi!1ahi!aa" + "'", str2.equals("aa11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaahi!1a11hi!11aahi!1ahi!aa"));
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test360");
        String str2 = RegExpMatcher.makeConcatenation("hi!aahi!1a11hi!11aahi!1ahi!aaa11", "hi!1ahi!1ahi!aa1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11aahi!1ahi!aa11hi!11hi!1a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!aahi!1a11hi!11aahi!1ahi!aaa11hi!1ahi!1ahi!aa1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11aahi!1ahi!aa11hi!11hi!1a" + "'", str2.equals("hi!aahi!1a11hi!11aahi!1ahi!aaa11hi!1ahi!1ahi!aa1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11aahi!1ahi!aa11hi!11hi!1a"));
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test361");
        boolean boolean2 = RegExpMatcher.matches("hi!1ahi!aaa11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aa", "hi!1ahi!1ahi!aa1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11aahi!1ahi!aa11hi!11hi!1ahi!1a11hi!11hi!1a11hi!11a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa1hi!1a11hi!11aahi!1ahi!aa11hi!aa11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test362");
        String str2 = RegExpMatcher.makeConcatenation("1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aa", "hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaahi!1a11hi!11hi!1a11hi!11a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa1hi!1a11hi!11aahi!1ahi!aa11hi!aa11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1ahi!hi!1a11hi!11aahi!1ahi!aaaahi!1a11hi!11hi!1a11hi!11a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa1hi!1a11hi!11aahi!1ahi!aa11hi!aa11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa" + "'", str2.equals("1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1ahi!hi!1a11hi!11aahi!1ahi!aaaahi!1a11hi!11hi!1a11hi!11a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa1hi!1a11hi!11aahi!1ahi!aa11hi!aa11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa"));
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test363");
        String str2 = RegExpMatcher.makeConcatenation("11hi!aa", "hi!1a11hi!11aahi!1ahi!aa11hi!11hi!1aa111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "11hi!aahi!1a11hi!11aahi!1ahi!aa11hi!11hi!1aa111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aa" + "'", str2.equals("11hi!aahi!1a11hi!11aahi!1ahi!aa11hi!11hi!1aa111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aa"));
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test364");
        boolean boolean2 = RegExpMatcher.matches("hi!1a11hi!11hi!1ahi!aaahi!1a11hi!11hi!1ahi!aa11hi!11", "11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!111hi!1hi!1ahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aa11hi!11");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test365");
        boolean boolean2 = RegExpMatcher.matches("hi!1ahi!1ahi!aa1a11hi!1a1111hi!1hi!1ahi!1ahi!aahi!", "1a11hi!1a11");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test366");
        String str2 = RegExpMatcher.makeConcatenation("11hi!ahi!1ahi!1a11hi!1hi!1ahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aa", "a111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aaa111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "11hi!ahi!1ahi!1a11hi!1hi!1ahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aaa111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aaa111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aa" + "'", str2.equals("11hi!ahi!1ahi!1a11hi!1hi!1ahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aaa111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aaa111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aa"));
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test367");
        boolean boolean2 = RegExpMatcher.matches("hi!1a11hi!11hi!1a11hi!11hi!1a11hi!1a11hi!1a11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa", "11hi!ahi!1ahi!1a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test368");
        String str2 = RegExpMatcher.makeConcatenation("11hi!1hi!1ahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!aahi!1a11hi!11hi!1ahi!aaahi!1a11hi!11hi!1a11hi!11hi!1a11hi!1a11", "hi!1a11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa1a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "11hi!1hi!1ahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!aahi!1a11hi!11hi!1ahi!aaahi!1a11hi!11hi!1a11hi!11hi!1a11hi!1a11hi!1a11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa1a" + "'", str2.equals("11hi!1hi!1ahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!aahi!1a11hi!11hi!1ahi!aaahi!1a11hi!11hi!1a11hi!11hi!1a11hi!1a11hi!1a11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa1a"));
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test369");
        String str2 = RegExpMatcher.makeConcatenation("11hi!1hi!1ahi!1ahi!aa1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11aahi!1ahi!aa11hi!11hi!1a", "hi!1a11hi!11hi!1ahi!aaahi!1a11hi!11hi!1ahi!aaa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "11hi!1hi!1ahi!1ahi!aa1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11aahi!1ahi!aa11hi!11hi!1ahi!1a11hi!11hi!1ahi!aaahi!1a11hi!11hi!1ahi!aaa" + "'", str2.equals("11hi!1hi!1ahi!1ahi!aa1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11aahi!1ahi!aa11hi!11hi!1ahi!1a11hi!11hi!1ahi!aaahi!1a11hi!11hi!1ahi!aaa"));
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test370");
        boolean boolean2 = RegExpMatcher.matches("hi!1ahi!aa", "1a11hi!1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test371");
        String str2 = RegExpMatcher.makeConcatenation("", "1a11hi!1a11");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1a11hi!1a11" + "'", str2.equals("1a11hi!1a11"));
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test372");
        String str2 = RegExpMatcher.makeConcatenation("1a11hi!1", "11hi!11hi!1a11hi!11aahi!1ahi!aa11hi!11hi!1aa111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1a11hi!111hi!11hi!1a11hi!11aahi!1ahi!aa11hi!11hi!1aa111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aa" + "'", str2.equals("1a11hi!111hi!11hi!1a11hi!11aahi!1ahi!aa11hi!11hi!1aa111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aa"));
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test373");
        boolean boolean2 = RegExpMatcher.matches("a111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11aa", "1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1ahi!hi!1a11hi!11aahi!1ahi!aaaahi!1a11hi!11hi!1a11hi!11a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa1hi!1a11hi!11aahi!1ahi!aa11hi!aa11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test374");
        boolean boolean2 = RegExpMatcher.matches("hi!hi!1ahi!1ahi!aa1a11hi!1a1111hi!1hi!1ahi!1ahi!aahi!1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aa11hi!11hi!1", "11");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test375");
        boolean boolean2 = RegExpMatcher.matches("11hi!1hi!1ahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aa", "hi!1a1ahi!1a11hi!11aahi!1ahi!aa1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test376");
        boolean boolean2 = RegExpMatcher.matches("", "ahi!1a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test377");
        boolean boolean2 = RegExpMatcher.matches("hi!1a11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aahi!1a11hi!11hi!1a11hi!11hi!", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test378");
        String str2 = RegExpMatcher.makeConcatenation("hi!hi!1ahi!1ahi!aa1a11hi!1a1111hi!1hi!1ahi!1ahi!aahi!1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aa11hi!11hi!1", "1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!hi!1ahi!1ahi!aa1a11hi!1a1111hi!1hi!1ahi!1ahi!aahi!1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aa11hi!11hi!11aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aa" + "'", str2.equals("hi!hi!1ahi!1ahi!aa1a11hi!1a1111hi!1hi!1ahi!1ahi!aahi!1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aa11hi!11hi!11aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aa"));
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test379");
        boolean boolean2 = RegExpMatcher.matches("hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaahi!1a1ahi!1a11hi!11aahi!1ahi!aa1", "1aahi!1ahi!1a11hi!11aahi!1a11hi!11");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test380");
        boolean boolean2 = RegExpMatcher.matches("11hi!ahi!1ahi!1a11hi!11hi!1ahi!aaahi!1a11hi!11hi!1a11hi!11hi!1a11hi!1a11", "hi!1a11hi!11aahi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test381");
        boolean boolean2 = RegExpMatcher.matches("hi!1a1ahi!1a11hi!11aahi!1ahi!aa1", "1aahi!1ahi!1a11hi!11aa1aahi!1ahi!1a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test382");
        String str2 = RegExpMatcher.makeConcatenation("1hi!1a11hi!11aahi!1ahi!aa11hi!11hi!1aa111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11hi!1a11hi!11hi!1a11hi!1a11", "hi!1a11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1hi!1a11hi!11aahi!1ahi!aa11hi!11hi!1aa111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11hi!1a11hi!11hi!1a11hi!1a11hi!1a11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa" + "'", str2.equals("1hi!1a11hi!11aahi!1ahi!aa11hi!11hi!1aa111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11hi!1a11hi!11hi!1a11hi!1a11hi!1a11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa"));
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test383");
        boolean boolean2 = RegExpMatcher.matches("hi!1ahi!hi!1a11hi!11aahi!1ahi!aa1a11hi!hi!1a11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa", "1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test384");
        String str2 = RegExpMatcher.makeConcatenation("aaa1111hi!1hi!1ahi!1ahi!aa1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11aahi!1ahi!aa11hi!11hi!1a", "11hi!1a11hi!11hi!1a11hi!11");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "aaa1111hi!1hi!1ahi!1ahi!aa1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11aahi!1ahi!aa11hi!11hi!1a11hi!1a11hi!11hi!1a11hi!11" + "'", str2.equals("aaa1111hi!1hi!1ahi!1ahi!aa1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11aahi!1ahi!aa11hi!11hi!1a11hi!1a11hi!11hi!1a11hi!11"));
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test385");
        String str2 = RegExpMatcher.makeConcatenation("hi!1a11hi!11hi!1a11hi!11hi!", "hi!1ahi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!1a11hi!11hi!1a11hi!11hi!hi!1ahi!1ahi!aa" + "'", str2.equals("hi!1a11hi!11hi!1a11hi!11hi!hi!1ahi!1ahi!aa"));
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test386");
        String str2 = RegExpMatcher.makeConcatenation("hi!1a11hi!11hi!1a11hi!11a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaahi!1a11hi!11hi!1a11hi!11a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa1hi!1a11hi!11aahi!1ahi!aa", "hi!1ahi!hi!1a11hi!11aahi!1ahi!aa1a11hi!hi!1a11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa1aahi!1a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!1a11hi!11hi!1a11hi!11a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaahi!1a11hi!11hi!1a11hi!11a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa1hi!1a11hi!11aahi!1ahi!aahi!1ahi!hi!1a11hi!11aahi!1ahi!aa1a11hi!hi!1a11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa1aahi!1a" + "'", str2.equals("hi!1a11hi!11hi!1a11hi!11a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaahi!1a11hi!11hi!1a11hi!11a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa1hi!1a11hi!11aahi!1ahi!aahi!1ahi!hi!1a11hi!11aahi!1ahi!aa1a11hi!hi!1a11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa1aahi!1a"));
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test387");
        boolean boolean2 = RegExpMatcher.matches("1aahi!1ahi!1a11hi!11aa1aahi!1ahi!1a", "hi!1a11hi!11hi!1ahi!aa11hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test388");
        String str2 = RegExpMatcher.makeConcatenation("a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaahi!1a11hi!11aahi!1ahi!aa", "11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!hi!1a11hi!11hi!1ahi!aa11hi!1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaahi!1a11hi!11aahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!hi!1a11hi!11hi!1ahi!aa11hi!1" + "'", str2.equals("a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaahi!1a11hi!11aahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!hi!1a11hi!11hi!1ahi!aa11hi!1"));
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test389");
        boolean boolean2 = RegExpMatcher.matches("1a", "aaa11hi!1a11hi!11hi!1a11hi!11hi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test390");
        String str2 = RegExpMatcher.makeConcatenation("hi!1a11hi!11hi!1a11hi!11", "11hi!1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!1a11hi!11hi!1a11hi!1111hi!1" + "'", str2.equals("hi!1a11hi!11hi!1a11hi!1111hi!1"));
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test391");
        String str2 = RegExpMatcher.makeConcatenation("11hi!ahi!1ahi!1a", "11hi!11hi!1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "11hi!ahi!1ahi!1a11hi!11hi!1" + "'", str2.equals("11hi!ahi!1ahi!1a11hi!11hi!1"));
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test392");
        String str2 = RegExpMatcher.makeConcatenation("1aahi!1ahi!1a11hi!11aahi!1a11hi!11hi!1ahi!aa11hi!", "1hi!1a11hi!11aahi!1ahi!aa11hi!11hi!1aa111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11hi!1a11hi!11hi!1a11hi!1a11hi!1a11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1aahi!1ahi!1a11hi!11aahi!1a11hi!11hi!1ahi!aa11hi!1hi!1a11hi!11aahi!1ahi!aa11hi!11hi!1aa111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11hi!1a11hi!11hi!1a11hi!1a11hi!1a11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa" + "'", str2.equals("1aahi!1ahi!1a11hi!11aahi!1a11hi!11hi!1ahi!aa11hi!1hi!1a11hi!11aahi!1ahi!aa11hi!11hi!1aa111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11hi!1a11hi!11hi!1a11hi!1a11hi!1a11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa"));
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test393");
        String str2 = RegExpMatcher.makeConcatenation("", "1hi!1a11hi!11aahi!1ahi!aa11hi!11hi!1aa111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1hi!1a11hi!11aahi!1ahi!aa11hi!11hi!1aa111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aa" + "'", str2.equals("1hi!1a11hi!11aahi!1ahi!aa11hi!11hi!1aa111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aa"));
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test394");
        String str2 = RegExpMatcher.makeConcatenation("11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!hi!1a11hi!11hi!1ahi!aa", "1hi!1a11hi!11aahi!1ahi!aa11hi!11hi!1aa111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11hi!1a11hi!11hi!1a11hi!1a11");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!hi!1a11hi!11hi!1ahi!aa1hi!1a11hi!11aahi!1ahi!aa11hi!11hi!1aa111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11hi!1a11hi!11hi!1a11hi!1a11" + "'", str2.equals("11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!hi!1a11hi!11hi!1ahi!aa1hi!1a11hi!11aahi!1ahi!aa11hi!11hi!1aa111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11hi!1a11hi!11hi!1a11hi!1a11"));
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test395");
        String str2 = RegExpMatcher.makeConcatenation("", "hi!1a11hi!11hi!1ahi!aaa1hi!1a11hi!11aahi!1ahi!aa11hi!ahi!1a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!1a11hi!11hi!1ahi!aaa1hi!1a11hi!11aahi!1ahi!aa11hi!ahi!1a" + "'", str2.equals("hi!1a11hi!11hi!1ahi!aaa1hi!1a11hi!11aahi!1ahi!aa11hi!ahi!1a"));
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test396");
        String str2 = RegExpMatcher.makeConcatenation("a11111hi!111ahi!1a11hi!11aahi!1ahi!aa", "1aahi!1ahi!1a11hi!11aahi!1a11hi!11");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a11111hi!111ahi!1a11hi!11aahi!1ahi!aa1aahi!1ahi!1a11hi!11aahi!1a11hi!11" + "'", str2.equals("a11111hi!111ahi!1a11hi!11aahi!1ahi!aa1aahi!1ahi!1a11hi!11aahi!1a11hi!11"));
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test397");
        String str2 = RegExpMatcher.makeConcatenation("11hi!1hi!1ahi!1ahi!aa1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11aahi!1ahi!aa11hi!11hi!1a", "11hi!ahi!1ahi!1a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "11hi!1hi!1ahi!1ahi!aa1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11aahi!1ahi!aa11hi!11hi!1a11hi!ahi!1ahi!1a" + "'", str2.equals("11hi!1hi!1ahi!1ahi!aa1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11aahi!1ahi!aa11hi!11hi!1a11hi!ahi!1ahi!1a"));
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test398");
        String str2 = RegExpMatcher.makeConcatenation("11hi!1hi!1ahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11aahi!1ahi!aa11hi!11hi!1a", "a111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aaa111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11hi!1a11hi!11hi!aahi!aahi!1a11hi!11hi!1ahi!aaahi!1a11hi!11hi!1a11hi!11hi!1a11hi!1a11");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "11hi!1hi!1ahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11aahi!1ahi!aa11hi!11hi!1aa111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aaa111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11hi!1a11hi!11hi!aahi!aahi!1a11hi!11hi!1ahi!aaahi!1a11hi!11hi!1a11hi!11hi!1a11hi!1a11" + "'", str2.equals("11hi!1hi!1ahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11aahi!1ahi!aa11hi!11hi!1aa111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aaa111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11hi!1a11hi!11hi!aahi!aahi!1a11hi!11hi!1ahi!aaahi!1a11hi!11hi!1a11hi!11hi!1a11hi!1a11"));
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test399");
        boolean boolean2 = RegExpMatcher.matches("hi!1a11hi!11hi!1a11hi!11a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa", "1a11hi!111hi!1hi!1ahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test400");
        boolean boolean2 = RegExpMatcher.matches("11hi!11hi!1a11hi!11aahi!1ahi!aa11hi!11hi!1aa111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aa", "a111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11aa1a11hi!111hi!1hi!1ahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test401");
        boolean boolean2 = RegExpMatcher.matches("11", "a111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11aa1a11hi!111hi!1hi!1ahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test402");
        String str2 = RegExpMatcher.makeConcatenation("1hi!1a11hi!11aahi!1ahi!aa11hi!11hi!1aa111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aa", "11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!hi!1a11hi!11hi!1ahi!aahi!1a11hi!11hi!1a11hi!11a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1hi!1a11hi!11aahi!1ahi!aa11hi!11hi!1aa111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!hi!1a11hi!11hi!1ahi!aahi!1a11hi!11hi!1a11hi!11a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa" + "'", str2.equals("1hi!1a11hi!11aahi!1ahi!aa11hi!11hi!1aa111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!hi!1a11hi!11hi!1ahi!aahi!1a11hi!11hi!1a11hi!11a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa"));
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test403");
        boolean boolean2 = RegExpMatcher.matches("a11111hi!111ahi!1a11hi!11aahi!1ahi!aa", "hi!1a11hi!11hi!1a11hi!11hi!1a11hi!1a11hi!1a11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa1hi!1a11hi!11aahi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test404");
        String str2 = RegExpMatcher.makeConcatenation("a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaahi!1a11hi!11aahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!hi!1a11hi!11hi!1ahi!aa11hi!1", "hi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaahi!1a11hi!11aahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!hi!1a11hi!11hi!1ahi!aa11hi!1hi!1ahi!aa" + "'", str2.equals("a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaahi!1a11hi!11aahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!hi!1a11hi!11hi!1ahi!aa11hi!1hi!1ahi!aa"));
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test405");
        String str2 = RegExpMatcher.makeConcatenation("1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1ahi!hi!1a11hi!11aahi!1ahi!aaaahi!1a11hi!11hi!1a11hi!11a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa1hi!1a11hi!11aahi!1ahi!aa11hi!aa11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa", "hi!1a11hi!11hi!1ahi!aaahi!1a11hi!11hi!1ahi!aa11hi!11");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1ahi!hi!1a11hi!11aahi!1ahi!aaaahi!1a11hi!11hi!1a11hi!11a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa1hi!1a11hi!11aahi!1ahi!aa11hi!aa11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aahi!1a11hi!11hi!1ahi!aaahi!1a11hi!11hi!1ahi!aa11hi!11" + "'", str2.equals("1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1ahi!hi!1a11hi!11aahi!1ahi!aaaahi!1a11hi!11hi!1a11hi!11a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa1hi!1a11hi!11aahi!1ahi!aa11hi!aa11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aahi!1a11hi!11hi!1ahi!aaahi!1a11hi!11hi!1ahi!aa11hi!11"));
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test406");
        boolean boolean2 = RegExpMatcher.matches("hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaahi!1a11hi!11hi!1a11hi!11a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa1hi!1a11hi!11aahi!1ahi!aa11hi!aa11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa", "11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!hi!1a11hi!11hi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test407");
        boolean boolean2 = RegExpMatcher.matches("a111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aaa111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aa", "11hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test408");
        String str2 = RegExpMatcher.makeConcatenation("1aahi!1ahi!1a11hi!11aahi!1a11hi!11", "aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1aahi!1ahi!1a11hi!11aahi!1a11hi!11aa" + "'", str2.equals("1aahi!1ahi!1a11hi!11aahi!1a11hi!11aa"));
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test409");
        boolean boolean2 = RegExpMatcher.matches("11hi!11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!hi!1a11hi!11hi!1ahi!aa11hi!1", "1aahi!1ahi!1a11hi!11aahi!1a11hi!11hi!1ahi!aa11hi!a11");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test410");
        String str2 = RegExpMatcher.makeConcatenation("hi!1a11hi!11hi!1ahi!aaahi!1a11hi!11hi!1a11hi!11hi!1a11hi!1a11", "hi!1a11hi!11aahi!1ahi!aa11hi!11hi!1a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!1a11hi!11hi!1ahi!aaahi!1a11hi!11hi!1a11hi!11hi!1a11hi!1a11hi!1a11hi!11aahi!1ahi!aa11hi!11hi!1a" + "'", str2.equals("hi!1a11hi!11hi!1ahi!aaahi!1a11hi!11hi!1a11hi!11hi!1a11hi!1a11hi!1a11hi!11aahi!1ahi!aa11hi!11hi!1a"));
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test411");
        boolean boolean2 = RegExpMatcher.matches("aaa111aahi!1ahi!1a11hi!11aa1aahi!1ahi!1a11hi!", "hi!aahi!1a11hi!11hi!1ahi!aaahi!1a11hi!11hi!1a11hi!11hi!1a11hi!1a11");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test412");
        String str2 = RegExpMatcher.makeConcatenation("11hi!1hi!1ahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11aahi!1ahi!aa11hi!11hi!1a", "hi!1a11hi!11hi!1a11hi!11hi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "11hi!1hi!1ahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11aahi!1ahi!aa11hi!11hi!1ahi!1a11hi!11hi!1a11hi!11hi!aa" + "'", str2.equals("11hi!1hi!1ahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11aahi!1ahi!aa11hi!11hi!1ahi!1a11hi!11hi!1a11hi!11hi!aa"));
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test413");
        String str2 = RegExpMatcher.makeConcatenation("aaa111aahi!1ahi!1a11hi!11aa1aahi!1ahi!1a11hi!", "11hi!11hi!1a11hi!11aahi!1ahi!aa11hi!11hi!1aa111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "aaa111aahi!1ahi!1a11hi!11aa1aahi!1ahi!1a11hi!11hi!11hi!1a11hi!11aahi!1ahi!aa11hi!11hi!1aa111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aa" + "'", str2.equals("aaa111aahi!1ahi!1a11hi!11aa1aahi!1ahi!1a11hi!11hi!11hi!1a11hi!11aahi!1ahi!aa11hi!11hi!1aa111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aa"));
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test414");
        String str2 = RegExpMatcher.makeConcatenation("11hi!ahi!1ahi!1a", "hi!1a11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "11hi!ahi!1ahi!1ahi!1a11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa" + "'", str2.equals("11hi!ahi!1ahi!1ahi!1a11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa"));
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test415");
        boolean boolean2 = RegExpMatcher.matches("11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!hi!1a11hi!11hi!1ahi!aa11hi!1", "11hi!111a11hi!111hi!1hi!1ahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test416");
        boolean boolean2 = RegExpMatcher.matches("a111", "11hi!1hi!1ahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!aahi!1a11hi!11hi!1ahi!aaahi!1a11hi!11hi!1a11hi!11hi!1a11hi!1a11");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test417");
        String str2 = RegExpMatcher.makeConcatenation("11hi!1hi!1ahi!1ahi!aahi!", "11hi!1hi!1ahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11aahi!1ahi!aa11hi!11hi!1aa111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aaa111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11hi!1a11hi!11hi!aahi!aahi!1a11hi!11hi!1ahi!aaahi!1a11hi!11hi!1a11hi!11hi!1a11hi!1a11");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "11hi!1hi!1ahi!1ahi!aahi!11hi!1hi!1ahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11aahi!1ahi!aa11hi!11hi!1aa111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aaa111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11hi!1a11hi!11hi!aahi!aahi!1a11hi!11hi!1ahi!aaahi!1a11hi!11hi!1a11hi!11hi!1a11hi!1a11" + "'", str2.equals("11hi!1hi!1ahi!1ahi!aahi!11hi!1hi!1ahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11aahi!1ahi!aa11hi!11hi!1aa111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aaa111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11hi!1a11hi!11hi!aahi!aahi!1a11hi!11hi!1ahi!aaahi!1a11hi!11hi!1a11hi!11hi!1a11hi!1a11"));
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test418");
        String str2 = RegExpMatcher.makeConcatenation("aaa11", "1aahi!1ahi!1a11hi!11aaa111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "aaa111aahi!1ahi!1a11hi!11aaa111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aa" + "'", str2.equals("aaa111aahi!1ahi!1a11hi!11aaa111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aa"));
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test419");
        String str2 = RegExpMatcher.makeConcatenation("1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1ahi!hi!1a11hi!11aahi!1ahi!aaaahi!1a11hi!11hi!1a11hi!11a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa1hi!1a11hi!11aahi!1ahi!aa11hi!aa11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa", "11hi!1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1ahi!hi!1a11hi!11aahi!1ahi!aaaahi!1a11hi!11hi!1a11hi!11a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa1hi!1a11hi!11aahi!1ahi!aa11hi!aa11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa11hi!1" + "'", str2.equals("1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1ahi!hi!1a11hi!11aahi!1ahi!aaaahi!1a11hi!11hi!1a11hi!11a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa1hi!1a11hi!11aahi!1ahi!aa11hi!aa11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa11hi!1"));
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test420");
        boolean boolean2 = RegExpMatcher.matches("1aahi!1aa11", "1aahi!1ahi!1a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test421");
        boolean boolean2 = RegExpMatcher.matches("hi!1a1ahi!1a11hi!11aahi!1ahi!aa1hi!1a11hi!11hi!1a11hi!11a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa1hi!1a11hi!11aahi!1ahi!aa11hi!aa11hi!11hi!1a", "11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa11hi!11hi!111hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!hi!1a11hi!11hi!1ahi!aa11hi!1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test422");
        boolean boolean2 = RegExpMatcher.matches("hi!1ahi!hi!1a11hi!11aahi!1ahi!aaa111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aaa111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aa", "11hi!1hi!1ahi!1ahi!aa1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11aahi!1ahi!aa11hi!11hi!1ahi!1a11hi!11hi!1ahi!aaahi!1a11hi!11hi!1ahi!aaa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test423");
        String str2 = RegExpMatcher.makeConcatenation("11hi!ahi!1ahi!1ahi!1a11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa", "1a11hi!1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "11hi!ahi!1ahi!1ahi!1a11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa1a11hi!1" + "'", str2.equals("11hi!ahi!1ahi!1ahi!1a11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa1a11hi!1"));
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test424");
        String str2 = RegExpMatcher.makeConcatenation("hi!1a1ahi!1a11hi!11aahi!1ahi!aa111hi!1hi!1ahi!1ahi!aa1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11aahi!1ahi!aa11hi!11hi!1a", "hi!1a11hi!11hi!1a11hi!11a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa1hi!1a11hi!11aahi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!1a1ahi!1a11hi!11aahi!1ahi!aa111hi!1hi!1ahi!1ahi!aa1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11aahi!1ahi!aa11hi!11hi!1ahi!1a11hi!11hi!1a11hi!11a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa1hi!1a11hi!11aahi!1ahi!aa" + "'", str2.equals("hi!1a1ahi!1a11hi!11aahi!1ahi!aa111hi!1hi!1ahi!1ahi!aa1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11aahi!1ahi!aa11hi!11hi!1ahi!1a11hi!11hi!1a11hi!11a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa1hi!1a11hi!11aahi!1ahi!aa"));
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test425");
        boolean boolean2 = RegExpMatcher.matches("1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1ahi!hi!1a11hi!11aahi!1ahi!aaaahi!1a11hi!11hi!1a11hi!11a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa1hi!1a11hi!11aahi!1ahi!aa11hi!aa11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa11hi!1", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test426");
        String str2 = RegExpMatcher.makeConcatenation("", "a111");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a111" + "'", str2.equals("a111"));
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test427");
        String str2 = RegExpMatcher.makeConcatenation("", "hi!1a11hi!11hi!1ahi!aa11hi!11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!1a11hi!11hi!1ahi!aa11hi!11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aa" + "'", str2.equals("hi!1a11hi!11hi!1ahi!aa11hi!11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aa"));
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test428");
        boolean boolean2 = RegExpMatcher.matches("hi!1ahi!aa", "1aahi!1ahi!1a11hi!11aaa111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test429");
        String str2 = RegExpMatcher.makeConcatenation("1aahi!1ahi!1a11hi!11aahi!1a11hi!11", "hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaahi!1a1ahi!1a11hi!11aahi!1ahi!aa1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1aahi!1ahi!1a11hi!11aahi!1a11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaahi!1a1ahi!1a11hi!11aahi!1ahi!aa1" + "'", str2.equals("1aahi!1ahi!1a11hi!11aahi!1a11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaahi!1a1ahi!1a11hi!11aahi!1ahi!aa1"));
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test430");
        String str2 = RegExpMatcher.makeConcatenation("hi!1ahi!aa", "hi!1a11hi!11hi!1a11hi!11hi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!1ahi!aahi!1a11hi!11hi!1a11hi!11hi!aa" + "'", str2.equals("hi!1ahi!aahi!1a11hi!11hi!1a11hi!11hi!aa"));
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test431");
        boolean boolean2 = RegExpMatcher.matches("1aahi!1ahi!1a11hi!11aahi!1a11hi!11hi!1ahi!aa11hi!a11", "hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test432");
        boolean boolean2 = RegExpMatcher.matches("1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11aahi!1ahi!aa11hi!11hi!1a", "hi!1a11hi!11hi!1a11hi!1111hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test433");
        String str2 = RegExpMatcher.makeConcatenation("hi!hi!1ahi!1ahi!aa1a11hi!1a1111hi!1hi!1ahi!1ahi!aahi!1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aa11hi!11hi!11aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aa", "hi!1a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!hi!1ahi!1ahi!aa1a11hi!1a1111hi!1hi!1ahi!1ahi!aahi!1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aa11hi!11hi!11aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a" + "'", str2.equals("hi!hi!1ahi!1ahi!aa1a11hi!1a1111hi!1hi!1ahi!1ahi!aahi!1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aa11hi!11hi!11aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a"));
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test434");
        boolean boolean2 = RegExpMatcher.matches("11hi!ahi!1ahi!1a11hi!1hi!1ahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aaa111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aaa111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aa", "a11111hi!111ahi!1a11hi!11aahi!1ahi!aa1aahi!1ahi!1a11hi!11aahi!1a11hi!11");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test435");
        boolean boolean2 = RegExpMatcher.matches("1aahi!1ahi!1a11hi!11aa1aahi!1ahi!1a11hi!", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test436");
        String str2 = RegExpMatcher.makeConcatenation("11hi!1hi!1ahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11aahi!1ahi!aa11hi!11hi!1ahi!1a11hi!11aahi!1ahi!aaa11", "1aahi!1ahi!1a11hi!11aaa111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "11hi!1hi!1ahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11aahi!1ahi!aa11hi!11hi!1ahi!1a11hi!11aahi!1ahi!aaa111aahi!1ahi!1a11hi!11aaa111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aa" + "'", str2.equals("11hi!1hi!1ahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11aahi!1ahi!aa11hi!11hi!1ahi!1a11hi!11aahi!1ahi!aaa111aahi!1ahi!1a11hi!11aaa111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aa"));
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test437");
        String str2 = RegExpMatcher.makeConcatenation("hi!1a11hi!11hi!1a11hi!11hi!aa", "11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!hi!1a11hi!11hi!1ahi!aahi!1a11hi!11hi!1a11hi!11a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!1a11hi!11hi!1a11hi!11hi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!hi!1a11hi!11hi!1ahi!aahi!1a11hi!11hi!1a11hi!11a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa" + "'", str2.equals("hi!1a11hi!11hi!1a11hi!11hi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!hi!1a11hi!11hi!1ahi!aahi!1a11hi!11hi!1a11hi!11a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa"));
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test438");
        String str2 = RegExpMatcher.makeConcatenation("1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11aahi!1ahi!aa11hi!11hi!1a", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11aahi!1ahi!aa11hi!11hi!1a" + "'", str2.equals("1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11aahi!1ahi!aa11hi!11hi!1a"));
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test439");
        boolean boolean2 = RegExpMatcher.matches("11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!hi!1a11hi!11hi!1ahi!aahi!1a11hi!11hi!1a11hi!11a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa", "hi!1a11hi!11hi!1a11hi!11a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaahi!1a11hi!11hi!1a11hi!11a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa1hi!1a11hi!11aahi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test440");
        boolean boolean2 = RegExpMatcher.matches("a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaahi!1a11hi!11aahi!1ahi!aa", "1aahi!1ahi!1a11hi!11aa1aahi!1ahi!1a1aahi!1ahi!1a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test441");
        boolean boolean2 = RegExpMatcher.matches("1a11hi!1", "hi!1ahi!hi!1a11hi!11aahi!1ahi!aaa111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aaa111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test442");
        String str2 = RegExpMatcher.makeConcatenation("hi!aahi!1a11hi!11hi!1ahi!aaahi!1a11hi!11hi!1a11hi!11hi!1a11hi!1a11", "11hi!1hi!1ahi!1ahi!aa1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11aahi!1ahi!aa11hi!11hi!1a11hi!ahi!1ahi!1a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!aahi!1a11hi!11hi!1ahi!aaahi!1a11hi!11hi!1a11hi!11hi!1a11hi!1a1111hi!1hi!1ahi!1ahi!aa1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11aahi!1ahi!aa11hi!11hi!1a11hi!ahi!1ahi!1a" + "'", str2.equals("hi!aahi!1a11hi!11hi!1ahi!aaahi!1a11hi!11hi!1a11hi!11hi!1a11hi!1a1111hi!1hi!1ahi!1ahi!aa1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11aahi!1ahi!aa11hi!11hi!1a11hi!ahi!1ahi!1a"));
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test443");
        boolean boolean2 = RegExpMatcher.matches("1a11hi!111hi!1hi!1ahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aaa11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaahi!1a11hi!11aahi!1ahi!aa", "hi!1a11hi!11hi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test444");
        String str2 = RegExpMatcher.makeConcatenation("hi!1a11hi!11hi!1a11hi!11a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa1hi!1a11hi!11aahi!1ahi!aa11hi!aa11hi!11hi!1a", "11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aahi!1a11hi!11hi!1a11hi!11a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa1hi!1a11hi!11aahi!1ahi!aa11hi!aa11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!1a11hi!11hi!1a11hi!11a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa1hi!1a11hi!11aahi!1ahi!aa11hi!aa11hi!11hi!1a11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aahi!1a11hi!11hi!1a11hi!11a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa1hi!1a11hi!11aahi!1ahi!aa11hi!aa11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa" + "'", str2.equals("hi!1a11hi!11hi!1a11hi!11a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa1hi!1a11hi!11aahi!1ahi!aa11hi!aa11hi!11hi!1a11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aahi!1a11hi!11hi!1a11hi!11a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa1hi!1a11hi!11aahi!1ahi!aa11hi!aa11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa"));
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test445");
        String str2 = RegExpMatcher.makeConcatenation("hi!1a11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!1a11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa" + "'", str2.equals("hi!1a11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa"));
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test446");
        boolean boolean2 = RegExpMatcher.matches("1aahi!1ahi!1a11hi!11aa1aahi!1ahi!1a1aahi!1ahi!1ahi!1ahi!aaa11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1ahi!aaa11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aa11hi!aa", "11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!hi!1a11hi!11hi!1ahi!aa11hi!1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test447");
        String str2 = RegExpMatcher.makeConcatenation("a11hi!1a11hi!11hi!1ahi!aa11hi!", "a111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a11hi!1a11hi!11hi!1ahi!aa11hi!a111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aa" + "'", str2.equals("a11hi!1a11hi!11hi!1ahi!aa11hi!a111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aa"));
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test448");
        boolean boolean2 = RegExpMatcher.matches("", "1aahi!1ahi!1a11hi!11aahi!1a11hi!11hi!1ahi!aa11hi!1hi!1a11hi!11aahi!1ahi!aa11hi!11hi!1aa111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11hi!1a11hi!11hi!1a11hi!1a11hi!1a11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test449");
        String str2 = RegExpMatcher.makeConcatenation("hi!1a11hi!11hi!1a11hi!11a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa", "hi!1a11hi!11hi!1ahi!aa11hi!11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!1a11hi!11hi!1a11hi!11a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaahi!1a11hi!11hi!1ahi!aa11hi!11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aa" + "'", str2.equals("hi!1a11hi!11hi!1a11hi!11a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaahi!1a11hi!11hi!1ahi!aa11hi!11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aa"));
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test450");
        String str2 = RegExpMatcher.makeConcatenation("hi!1a11hi!11hi!1a11hi!1111hi!1", "hi!1a11hi!11hi!1a11hi!11");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!1a11hi!11hi!1a11hi!1111hi!1hi!1a11hi!11hi!1a11hi!11" + "'", str2.equals("hi!1a11hi!11hi!1a11hi!1111hi!1hi!1a11hi!11hi!1a11hi!11"));
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test451");
        String str2 = RegExpMatcher.makeConcatenation("11", "hi!1ahi!1ahi!aa1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11aahi!1ahi!aa11hi!11hi!1a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "11hi!1ahi!1ahi!aa1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11aahi!1ahi!aa11hi!11hi!1a" + "'", str2.equals("11hi!1ahi!1ahi!aa1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11aahi!1ahi!aa11hi!11hi!1a"));
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test452");
        String str2 = RegExpMatcher.makeConcatenation("11hi!ahi!1ahi!1a11hi!11hi!1ahi!aaahi!1a11hi!11hi!1a11hi!11hi!1a11hi!1a11", "11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa11hi!11hi!1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "11hi!ahi!1ahi!1a11hi!11hi!1ahi!aaahi!1a11hi!11hi!1a11hi!11hi!1a11hi!1a1111hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa11hi!11hi!1" + "'", str2.equals("11hi!ahi!1ahi!1a11hi!11hi!1ahi!aaahi!1a11hi!11hi!1a11hi!11hi!1a11hi!1a1111hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa11hi!11hi!1"));
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test453");
        String str2 = RegExpMatcher.makeConcatenation("1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1ahi!hi!1a11hi!11aahi!1ahi!aaaahi!1a11hi!11hi!1a11hi!11a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa1hi!1a11hi!11aahi!1ahi!aa11hi!aa11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa11hi!1", "1aahi!1ahi!1a11hi!11aa1aahi!1ahi!1a1aahi!1ahi!1ahi!1ahi!aaa11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1ahi!aaa11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1ahi!hi!1a11hi!11aahi!1ahi!aaaahi!1a11hi!11hi!1a11hi!11a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa1hi!1a11hi!11aahi!1ahi!aa11hi!aa11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa11hi!11aahi!1ahi!1a11hi!11aa1aahi!1ahi!1a1aahi!1ahi!1ahi!1ahi!aaa11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1ahi!aaa11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aa" + "'", str2.equals("1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1ahi!hi!1a11hi!11aahi!1ahi!aaaahi!1a11hi!11hi!1a11hi!11a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa1hi!1a11hi!11aahi!1ahi!aa11hi!aa11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa11hi!11aahi!1ahi!1a11hi!11aa1aahi!1ahi!1a1aahi!1ahi!1ahi!1ahi!aaa11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1ahi!aaa11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aa"));
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test454");
        String str2 = RegExpMatcher.makeConcatenation("1aahi!1ahi!1a11hi!11aa1aahi!1ahi!1a1aahi!1ahi!1ahi!1ahi!aaa11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1ahi!aaa11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aa11hi!aa", "11hi!11hi!1a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1aahi!1ahi!1a11hi!11aa1aahi!1ahi!1a1aahi!1ahi!1ahi!1ahi!aaa11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1ahi!aaa11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aa11hi!aa11hi!11hi!1a" + "'", str2.equals("1aahi!1ahi!1a11hi!11aa1aahi!1ahi!1a1aahi!1ahi!1ahi!1ahi!aaa11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1ahi!aaa11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aa11hi!aa11hi!11hi!1a"));
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test455");
        boolean boolean2 = RegExpMatcher.matches("hi!1ahi!hi!1a11hi!11aahi!1ahi!aa1a", "aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test456");
        String str2 = RegExpMatcher.makeConcatenation("1a11hi!1", "hi!1a11hi!11hi!1a11hi!11a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaahi!1a11hi!11hi!1ahi!aa11hi!11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1a11hi!1hi!1a11hi!11hi!1a11hi!11a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaahi!1a11hi!11hi!1ahi!aa11hi!11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aa" + "'", str2.equals("1a11hi!1hi!1a11hi!11hi!1a11hi!11a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaahi!1a11hi!11hi!1ahi!aa11hi!11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aa"));
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test457");
        String str2 = RegExpMatcher.makeConcatenation("11hi!11hi!1a11hi!11aahi!1ahi!aa11hi!11hi!1aa111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aa", "1a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "11hi!11hi!1a11hi!11aahi!1ahi!aa11hi!11hi!1aa111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aa1a" + "'", str2.equals("11hi!11hi!1a11hi!11aahi!1ahi!aa11hi!11hi!1aa111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aa1a"));
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test458");
        String str2 = RegExpMatcher.makeConcatenation("1aahi!1ahi!1a11hi!11aahi!1a11hi!11hi!1ahi!aa11hi!a11", "1aahi!1ahi!1a11hi!11aahi!1a11hi!11hi!1ahi!aa11hi!a11");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1aahi!1ahi!1a11hi!11aahi!1a11hi!11hi!1ahi!aa11hi!a111aahi!1ahi!1a11hi!11aahi!1a11hi!11hi!1ahi!aa11hi!a11" + "'", str2.equals("1aahi!1ahi!1a11hi!11aahi!1a11hi!11hi!1ahi!aa11hi!a111aahi!1ahi!1a11hi!11aahi!1a11hi!11hi!1ahi!aa11hi!a11"));
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test459");
        String str2 = RegExpMatcher.makeConcatenation("1aahi!1ahi!1a11hi!11aa1aahi!1ahi!1a1aahi!1ahi!1ahi!1ahi!aaa11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1ahi!aaa11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aa", "hi!aahi!1a11hi!11hi!1ahi!aaahi!1a11hi!11hi!1a11hi!11hi!1a11hi!1a1111hi!1hi!1ahi!1ahi!aa1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11aahi!1ahi!aa11hi!11hi!1a11hi!ahi!1ahi!1a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1aahi!1ahi!1a11hi!11aa1aahi!1ahi!1a1aahi!1ahi!1ahi!1ahi!aaa11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1ahi!aaa11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!aahi!1a11hi!11hi!1ahi!aaahi!1a11hi!11hi!1a11hi!11hi!1a11hi!1a1111hi!1hi!1ahi!1ahi!aa1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11aahi!1ahi!aa11hi!11hi!1a11hi!ahi!1ahi!1a" + "'", str2.equals("1aahi!1ahi!1a11hi!11aa1aahi!1ahi!1a1aahi!1ahi!1ahi!1ahi!aaa11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1ahi!aaa11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!aahi!1a11hi!11hi!1ahi!aaahi!1a11hi!11hi!1a11hi!11hi!1a11hi!1a1111hi!1hi!1ahi!1ahi!aa1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11aahi!1ahi!aa11hi!11hi!1a11hi!ahi!1ahi!1a"));
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test460");
        String str2 = RegExpMatcher.makeConcatenation("11hi!1ahi!1ahi!aa1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11aahi!1ahi!aa11hi!11hi!1a", "a11");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "11hi!1ahi!1ahi!aa1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11aahi!1ahi!aa11hi!11hi!1aa11" + "'", str2.equals("11hi!1ahi!1ahi!aa1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11aahi!1ahi!aa11hi!11hi!1aa11"));
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test461");
        String str2 = RegExpMatcher.makeConcatenation("hi!1a11hi!11hi!1a11hi!11hi!aahi!aahi!1a11hi!11hi!1ahi!aaahi!1a11hi!11hi!1a11hi!11hi!1a11hi!1a11", "hi!1ahi!1ahi!aa1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11aahi!1ahi!aa11hi!11hi!1a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!1a11hi!11hi!1a11hi!11hi!aahi!aahi!1a11hi!11hi!1ahi!aaahi!1a11hi!11hi!1a11hi!11hi!1a11hi!1a11hi!1ahi!1ahi!aa1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11aahi!1ahi!aa11hi!11hi!1a" + "'", str2.equals("hi!1a11hi!11hi!1a11hi!11hi!aahi!aahi!1a11hi!11hi!1ahi!aaahi!1a11hi!11hi!1a11hi!11hi!1a11hi!1a11hi!1ahi!1ahi!aa1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11aahi!1ahi!aa11hi!11hi!1a"));
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test462");
        String str2 = RegExpMatcher.makeConcatenation("hi!1a11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa", "11hi!ahi!1ahi!1ahi!1a11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa1a11hi!1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!1a11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa11hi!ahi!1ahi!1ahi!1a11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa1a11hi!1" + "'", str2.equals("hi!1a11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa11hi!ahi!1ahi!1ahi!1a11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa1a11hi!1"));
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test463");
        String str2 = RegExpMatcher.makeConcatenation("hi!1ahi!1ahi!aa1a11hi!1a11", "11hi!11");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!1ahi!1ahi!aa1a11hi!1a1111hi!11" + "'", str2.equals("hi!1ahi!1ahi!aa1a11hi!1a1111hi!11"));
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test464");
        boolean boolean2 = RegExpMatcher.matches("hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaahi!1a11hi!11hi!1a11hi!11a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa1hi!1a11hi!11aahi!1ahi!aa11hi!aa11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa", "11hi!aa11hi!11hi!1a1ahi!1a11hi!11aahi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test465");
        String str2 = RegExpMatcher.makeConcatenation("hi!1a11hi!11hi!1ahi!aaa1hi!1a11hi!11aahi!1ahi!aa11hi!ahi!1a", "hi!1a11hi!11aahi!1ahi!aaa11");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!1a11hi!11hi!1ahi!aaa1hi!1a11hi!11aahi!1ahi!aa11hi!ahi!1ahi!1a11hi!11aahi!1ahi!aaa11" + "'", str2.equals("hi!1a11hi!11hi!1ahi!aaa1hi!1a11hi!11aahi!1ahi!aa11hi!ahi!1ahi!1a11hi!11aahi!1ahi!aaa11"));
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test466");
        String str2 = RegExpMatcher.makeConcatenation("hi!1a11hi!11", "hi!1a11hi!11hi!1ahi!aaahi!1a11hi!11hi!1a11hi!11hi!1a11hi!1a11");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!1a11hi!11hi!1a11hi!11hi!1ahi!aaahi!1a11hi!11hi!1a11hi!11hi!1a11hi!1a11" + "'", str2.equals("hi!1a11hi!11hi!1a11hi!11hi!1ahi!aaahi!1a11hi!11hi!1a11hi!11hi!1a11hi!1a11"));
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test467");
        boolean boolean2 = RegExpMatcher.matches("a111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11aa", "a111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11aa1a11hi!111hi!1hi!1ahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test468");
        boolean boolean2 = RegExpMatcher.matches("1aahi!1ahi!1a", "11hi!aahi!1a11hi!11aahi!1ahi!aa11hi!11hi!1aa111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test469");
        boolean boolean2 = RegExpMatcher.matches("hi!1a11hi!11hi!1ahi!aaahi!1a11hi!11hi!1ahi!aa", "hi!1a11hi!11hi!1a11hi!11a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa1hi!1a11hi!11aahi!1ahi!aa11hi!aa11hi!11hi!1a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test470");
        boolean boolean2 = RegExpMatcher.matches("11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!hi!1a11hi!11hi!1ahi!aa1hi!1a11hi!11aahi!1ahi!aa11hi!11hi!1aa111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11hi!1a11hi!11hi!1a11hi!1a11", "hi!1a11hi!11hi!1ahi!aaahi!1a11hi!11hi!1a11hi!11hi!1a11hi!1a11hi!1a11hi!11aahi!1ahi!aa11hi!11hi!1a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test471");
        boolean boolean2 = RegExpMatcher.matches("11hi!111a11hi!111hi!1hi!1ahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aa", "hi!1a11hi!11hi!1a11hi!11a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa1hi!1a11hi!11aahi!1ahi!aa11hi!aa11hi!11hi!1a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test472");
        String str2 = RegExpMatcher.makeConcatenation("a111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aa", "hi!1a11hi!11hi!1a11hi!11hi!aahi!aahi!1a11hi!11hi!1ahi!aaahi!1a11hi!11hi!1a11hi!11hi!1a11hi!1a11hi!1ahi!1ahi!aa1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11aahi!1ahi!aa11hi!11hi!1a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11hi!1a11hi!11hi!aahi!aahi!1a11hi!11hi!1ahi!aaahi!1a11hi!11hi!1a11hi!11hi!1a11hi!1a11hi!1ahi!1ahi!aa1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11aahi!1ahi!aa11hi!11hi!1a" + "'", str2.equals("a111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11hi!1a11hi!11hi!aahi!aahi!1a11hi!11hi!1ahi!aaahi!1a11hi!11hi!1a11hi!11hi!1a11hi!1a11hi!1ahi!1ahi!aa1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11aahi!1ahi!aa11hi!11hi!1a"));
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test473");
        String str2 = RegExpMatcher.makeConcatenation("1aahi!1ahi!1a11hi!11aa1aahi!1ahi!1a11hi!", "a111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aaa111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11hi!1a11hi!11hi!aahi!aahi!1a11hi!11hi!1ahi!aaahi!1a11hi!11hi!1a11hi!11hi!1a11hi!1a11");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1aahi!1ahi!1a11hi!11aa1aahi!1ahi!1a11hi!a111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aaa111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11hi!1a11hi!11hi!aahi!aahi!1a11hi!11hi!1ahi!aaahi!1a11hi!11hi!1a11hi!11hi!1a11hi!1a11" + "'", str2.equals("1aahi!1ahi!1a11hi!11aa1aahi!1ahi!1a11hi!a111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aaa111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11hi!1a11hi!11hi!aahi!aahi!1a11hi!11hi!1ahi!aaahi!1a11hi!11hi!1a11hi!11hi!1a11hi!1a11"));
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test474");
        boolean boolean2 = RegExpMatcher.matches("11hi!11hi!1", "hi!1a11hi!11hi!1a11hi!1111hi!1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test475");
        boolean boolean2 = RegExpMatcher.matches("hi!hi!1ahi!1ahi!aa1a11hi!1a1111hi!1hi!1ahi!1ahi!aahi!1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aa11hi!11hi!11aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a", "hi!1ahi!hi!1a11hi!11aahi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test476");
        String str2 = RegExpMatcher.makeConcatenation("aaa11", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "aaa11" + "'", str2.equals("aaa11"));
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test477");
        String str2 = RegExpMatcher.makeConcatenation("1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11aahi!1ahi!aa11hi!11hi!1a", "11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!hi!1a11hi!11hi!1ahi!aahi!1a11hi!11hi!1a11hi!11a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11aahi!1ahi!aa11hi!11hi!1a11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!hi!1a11hi!11hi!1ahi!aahi!1a11hi!11hi!1a11hi!11a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa" + "'", str2.equals("1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11aahi!1ahi!aa11hi!11hi!1a11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!hi!1a11hi!11hi!1ahi!aahi!1a11hi!11hi!1a11hi!11a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa"));
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test478");
        String str2 = RegExpMatcher.makeConcatenation("11", "1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1ahi!hi!1a11hi!11aahi!1ahi!aaaahi!1a11hi!11hi!1a11hi!11a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa1hi!1a11hi!11aahi!1ahi!aa11hi!aa11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aahi!1a11hi!11hi!1ahi!aaahi!1a11hi!11hi!1ahi!aa11hi!11");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1ahi!hi!1a11hi!11aahi!1ahi!aaaahi!1a11hi!11hi!1a11hi!11a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa1hi!1a11hi!11aahi!1ahi!aa11hi!aa11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aahi!1a11hi!11hi!1ahi!aaahi!1a11hi!11hi!1ahi!aa11hi!11" + "'", str2.equals("111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1ahi!hi!1a11hi!11aahi!1ahi!aaaahi!1a11hi!11hi!1a11hi!11a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa1hi!1a11hi!11aahi!1ahi!aa11hi!aa11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aahi!1a11hi!11hi!1ahi!aaahi!1a11hi!11hi!1ahi!aa11hi!11"));
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test479");
        boolean boolean2 = RegExpMatcher.matches("hi!1a11hi!11hi!1a11hi!11a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaahi!1a11hi!11hi!1a11hi!11a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa1hi!1a11hi!11aahi!1ahi!aahi!1a11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa", "hi!1ahi!hi!1a11hi!11aahi!1ahi!aa1a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test480");
        String str2 = RegExpMatcher.makeConcatenation("aaa11", "hi!aahi!1a11hi!11hi!1ahi!aaahi!1a11hi!11hi!1a11hi!11hi!1a11hi!1a11");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "aaa11hi!aahi!1a11hi!11hi!1ahi!aaahi!1a11hi!11hi!1a11hi!11hi!1a11hi!1a11" + "'", str2.equals("aaa11hi!aahi!1a11hi!11hi!1ahi!aaahi!1a11hi!11hi!1a11hi!11hi!1a11hi!1a11"));
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test481");
        boolean boolean2 = RegExpMatcher.matches("ahi!1a", "aaa1111hi!1hi!1ahi!1ahi!aa1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11aahi!1ahi!aa11hi!11hi!1a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test482");
        String str2 = RegExpMatcher.makeConcatenation("a111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aaa111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11hi!1a11hi!11hi!aahi!aahi!1a11hi!11hi!1ahi!aaahi!1a11hi!11hi!1a11hi!11hi!1a11hi!1a11", "hi!aahi!1a11hi!11hi!1ahi!aaahi!1a11hi!11hi!1a11hi!11hi!1a11hi!1a11");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aaa111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11hi!1a11hi!11hi!aahi!aahi!1a11hi!11hi!1ahi!aaahi!1a11hi!11hi!1a11hi!11hi!1a11hi!1a11hi!aahi!1a11hi!11hi!1ahi!aaahi!1a11hi!11hi!1a11hi!11hi!1a11hi!1a11" + "'", str2.equals("a111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aaa111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11hi!1a11hi!11hi!aahi!aahi!1a11hi!11hi!1ahi!aaahi!1a11hi!11hi!1a11hi!11hi!1a11hi!1a11hi!aahi!1a11hi!11hi!1ahi!aaahi!1a11hi!11hi!1a11hi!11hi!1a11hi!1a11"));
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test483");
        boolean boolean2 = RegExpMatcher.matches("hi!1ahi!1ahi!aa1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11aahi!1ahi!aa11hi!11hi!1ahi!1a11hi!11hi!1a11hi!11a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa1hi!1a11hi!11aahi!1ahi!aa11hi!aa11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa", "11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test484");
        boolean boolean2 = RegExpMatcher.matches("a11", "11hi!1hi!1ahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11aahi!1ahi!aa11hi!11hi!1ahi!1a11hi!11aahi!1ahi!aaa111aahi!1ahi!1a11hi!11aaa111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test485");
        String str2 = RegExpMatcher.makeConcatenation("hi!1ahi!1ahi!aa1a11hi!1a11", "1aahi!1ahi!1a11hi!11aahi!1a11hi!11aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!1ahi!1ahi!aa1a11hi!1a111aahi!1ahi!1a11hi!11aahi!1a11hi!11aa" + "'", str2.equals("hi!1ahi!1ahi!aa1a11hi!1a111aahi!1ahi!1a11hi!11aahi!1a11hi!11aa"));
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test486");
        String str2 = RegExpMatcher.makeConcatenation("1a11hi!11aahi!1ahi!1a11hi!11aa1aahi!1ahi!1a1aahi!1ahi!1a", "1hi!1a11hi!11aahi!1ahi!aa11hi!ahi!1a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1a11hi!11aahi!1ahi!1a11hi!11aa1aahi!1ahi!1a1aahi!1ahi!1a1hi!1a11hi!11aahi!1ahi!aa11hi!ahi!1a" + "'", str2.equals("1a11hi!11aahi!1ahi!1a11hi!11aa1aahi!1ahi!1a1aahi!1ahi!1a1hi!1a11hi!11aahi!1ahi!aa11hi!ahi!1a"));
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test487");
        boolean boolean2 = RegExpMatcher.matches("11hi!1ahi!1ahi!aa1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11aahi!1ahi!aa11hi!11hi!1a", "11hi!1ahi!1ahi!aa1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11aahi!1ahi!aa11hi!11hi!1aa11");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test488");
        boolean boolean2 = RegExpMatcher.matches("aaa111aahi!1ahi!1a11hi!11aa1aahi!1ahi!1a11hi!", "hi!1a11hi!11hi!1a11hi!11a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaahi!1a11hi!11hi!1a11hi!11a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa1hi!1a11hi!11aahi!1ahi!aahi!1ahi!hi!1a11hi!11aahi!1ahi!aa1a11hi!hi!1a11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa1aahi!1a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test489");
        boolean boolean2 = RegExpMatcher.matches("hi!1a11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa1a", "hi!hi!1a11hi!11aahi!1ahi!aaa111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test490");
        boolean boolean2 = RegExpMatcher.matches("11hi!ahi!1ahi!1ahi!1a11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa", "a111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11aa1a11hi!111hi!1hi!1ahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test491");
        boolean boolean2 = RegExpMatcher.matches("hi!1a11hi!11hi!1a11hi!11hi!hi!1ahi!1ahi!aa", "a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test492");
        String str2 = RegExpMatcher.makeConcatenation("hi!1a11hi!11hi!1ahi!aaahi!1a11hi!11hi!1ahi!aa11hi!11", "1hi!1a11hi!11aahi!1ahi!aa11hi!11hi!1aa111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!hi!1a11hi!11hi!1ahi!aahi!1a11hi!11hi!1a11hi!11a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!1a11hi!11hi!1ahi!aaahi!1a11hi!11hi!1ahi!aa11hi!111hi!1a11hi!11aahi!1ahi!aa11hi!11hi!1aa111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!hi!1a11hi!11hi!1ahi!aahi!1a11hi!11hi!1a11hi!11a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa" + "'", str2.equals("hi!1a11hi!11hi!1ahi!aaahi!1a11hi!11hi!1ahi!aa11hi!111hi!1a11hi!11aahi!1ahi!aa11hi!11hi!1aa111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!hi!1a11hi!11hi!1ahi!aahi!1a11hi!11hi!1a11hi!11a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa"));
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test493");
        boolean boolean2 = RegExpMatcher.matches("11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aahi!1a11hi!11hi!1a11hi!11a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa1hi!1a11hi!11aahi!1ahi!aa11hi!aa11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa", "a111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11hi!1a11hi!11hi!aahi!aahi!1a11hi!11hi!1ahi!aaahi!1a11hi!11hi!1a11hi!11hi!1a11hi!1a11hi!1ahi!1ahi!aa1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11aahi!1ahi!aa11hi!11hi!1a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test494");
        String str2 = RegExpMatcher.makeConcatenation("11hi!1ahi!1ahi!aa1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11aahi!1ahi!aa11hi!11hi!1aa11", "1ahi!1a11hi!11aahi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "11hi!1ahi!1ahi!aa1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11aahi!1ahi!aa11hi!11hi!1aa111ahi!1a11hi!11aahi!1ahi!aa" + "'", str2.equals("11hi!1ahi!1ahi!aa1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11aahi!1ahi!aa11hi!11hi!1aa111ahi!1a11hi!11aahi!1ahi!aa"));
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test495");
        boolean boolean2 = RegExpMatcher.matches("hi!1a11hi!11hi!1a11hi!11hi!aahi!aahi!1a11hi!11hi!1ahi!aaahi!1a11hi!11hi!1a11hi!11hi!1a11hi!1a11", "hi!1ahi!1ahi!aa1a11hi!1a111aahi!1ahi!1a11hi!11aahi!1a11hi!11aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test496");
        String str2 = RegExpMatcher.makeConcatenation("a111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11aa", "hi!1a11hi!11hi!1a11hi!11hi!1a11hi!1a11");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11aahi!1a11hi!11hi!1a11hi!11hi!1a11hi!1a11" + "'", str2.equals("a111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11aahi!1a11hi!11hi!1a11hi!11hi!1a11hi!1a11"));
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test497");
        boolean boolean2 = RegExpMatcher.matches("hi!1ahi!aa", "1a11hi!111hi!1hi!1ahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aaa11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaahi!1a11hi!11aahi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test498");
        boolean boolean2 = RegExpMatcher.matches("1hi!1a11hi!11aahi!1ahi!aa", "11hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test499");
        boolean boolean2 = RegExpMatcher.matches("11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!", "1aahi!1ahi!1a11hi!11aa1aahi!1ahi!1a1aahi!1ahi!1ahi!1ahi!aaa11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1ahi!aaa11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aa11hi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Task3_2.test500");
        boolean boolean2 = RegExpMatcher.matches("1a11hi!1", "11hi!1ahi!1ahi!aa1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11aahi!1ahi!aa11hi!11hi!1aa11");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test501");
        String str2 = RegExpMatcher.makeConcatenation("hi!1a11hi!11hi!1a11hi!1111hi!1hi!1a11hi!11hi!1a11hi!11", "hi!1a11hi!11hi!1ahi!aaa1hi!1a11hi!11aahi!1ahi!aa11hi!ahi!1a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!1a11hi!11hi!1a11hi!1111hi!1hi!1a11hi!11hi!1a11hi!11hi!1a11hi!11hi!1ahi!aaa1hi!1a11hi!11aahi!1ahi!aa11hi!ahi!1a" + "'", str2.equals("hi!1a11hi!11hi!1a11hi!1111hi!1hi!1a11hi!11hi!1a11hi!11hi!1a11hi!11hi!1ahi!aaa1hi!1a11hi!11aahi!1ahi!aa11hi!ahi!1a"));
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test502");
        String str2 = RegExpMatcher.makeConcatenation("a111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11aahi!1a11hi!11hi!1a11hi!11hi!1a11hi!1a11", "hi!1a11hi!11hi!1a11hi!11hi!1a11hi!1a11hi!1a11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11aahi!1a11hi!11hi!1a11hi!11hi!1a11hi!1a11hi!1a11hi!11hi!1a11hi!11hi!1a11hi!1a11hi!1a11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa" + "'", str2.equals("a111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11aahi!1a11hi!11hi!1a11hi!11hi!1a11hi!1a11hi!1a11hi!11hi!1a11hi!11hi!1a11hi!1a11hi!1a11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa"));
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test503");
        boolean boolean2 = RegExpMatcher.matches("a111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aaa111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11hi!1a11hi!11hi!aahi!aahi!1a11hi!11hi!1ahi!aaahi!1a11hi!11hi!1a11hi!11hi!1a11hi!1a11", "11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!111hi!1hi!1ahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aa11hi!11");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test504");
        String str2 = RegExpMatcher.makeConcatenation("a", "11hi!1hi!1ahi!1ahi!aa1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11aahi!1ahi!aa11hi!11hi!1a11hi!ahi!1ahi!1a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a11hi!1hi!1ahi!1ahi!aa1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11aahi!1ahi!aa11hi!11hi!1a11hi!ahi!1ahi!1a" + "'", str2.equals("a11hi!1hi!1ahi!1ahi!aa1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11aahi!1ahi!aa11hi!11hi!1a11hi!ahi!1ahi!1a"));
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test505");
        boolean boolean2 = RegExpMatcher.matches("hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa", "11hi!ahi!1ahi!1a11hi!11hi!1ahi!aaahi!1a11hi!11hi!1a11hi!11hi!1a11hi!1a11");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test506");
        boolean boolean2 = RegExpMatcher.matches("hi!1a11hi!11aahi!1ahi!aa11hi!11hi!1a", "hi!1ahi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test507");
        String str2 = RegExpMatcher.makeConcatenation("", "11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!" + "'", str2.equals("11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!"));
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test508");
        String str2 = RegExpMatcher.makeConcatenation("hi!1a11hi!11hi!1ahi!aaahi!1a11hi!11hi!1a11hi!11hi!1a11hi!1a11hi!1a11hi!11aahi!1ahi!aa11hi!11hi!1a", "11hi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!1a11hi!11hi!1ahi!aaahi!1a11hi!11hi!1a11hi!11hi!1a11hi!1a11hi!1a11hi!11aahi!1ahi!aa11hi!11hi!1a11hi!aa" + "'", str2.equals("hi!1a11hi!11hi!1ahi!aaahi!1a11hi!11hi!1a11hi!11hi!1a11hi!1a11hi!1a11hi!11aahi!1ahi!aa11hi!11hi!1a11hi!aa"));
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test509");
        boolean boolean2 = RegExpMatcher.matches("1aahi!1ahi!1a11hi!11aahi!1a11hi!11aa", "11hi!ahi!1ahi!1a11hi!11hi!1ahi!aaahi!1a11hi!11hi!1a11hi!11hi!1a11hi!1a1111hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa11hi!11hi!1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test510");
        boolean boolean2 = RegExpMatcher.matches("hi!1ahi!hi!1a11hi!11aahi!1ahi!aa1a11hi!hi!1a11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa", "1a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test511");
        String str2 = RegExpMatcher.makeConcatenation("1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1ahi!hi!1a11hi!11aahi!1ahi!aaaahi!1a11hi!11hi!1a11hi!11a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa1hi!1a11hi!11aahi!1ahi!aa11hi!aa11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa11hi!11aahi!1ahi!1a11hi!11aa1aahi!1ahi!1a1aahi!1ahi!1ahi!1ahi!aaa11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1ahi!aaa11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aa", "11hi!aahi!1a11hi!11aahi!1ahi!aa11hi!11hi!1aa111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1ahi!hi!1a11hi!11aahi!1ahi!aaaahi!1a11hi!11hi!1a11hi!11a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa1hi!1a11hi!11aahi!1ahi!aa11hi!aa11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa11hi!11aahi!1ahi!1a11hi!11aa1aahi!1ahi!1a1aahi!1ahi!1ahi!1ahi!aaa11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1ahi!aaa11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aa11hi!aahi!1a11hi!11aahi!1ahi!aa11hi!11hi!1aa111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aa" + "'", str2.equals("1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1ahi!hi!1a11hi!11aahi!1ahi!aaaahi!1a11hi!11hi!1a11hi!11a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa1hi!1a11hi!11aahi!1ahi!aa11hi!aa11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa11hi!11aahi!1ahi!1a11hi!11aa1aahi!1ahi!1a1aahi!1ahi!1ahi!1ahi!aaa11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1ahi!aaa11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aa11hi!aahi!1a11hi!11aahi!1ahi!aa11hi!11hi!1aa111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aa"));
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test512");
        boolean boolean2 = RegExpMatcher.matches("hi!1ahi!1ahi!aa1a11hi!1a111aahi!1ahi!1a11hi!11aahi!1a11hi!11aa", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test513");
        boolean boolean2 = RegExpMatcher.matches("1aahi!1ahi!1a11hi!11aahi!1a11hi!11hi!1ahi!aa11hi!", "a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaahi!1a11hi!11aahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!hi!1a11hi!11hi!1ahi!aa11hi!1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test514");
        String str2 = RegExpMatcher.makeConcatenation("11hi!1hi!1ahi!1ahi!aa1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11aahi!1ahi!aa11hi!11hi!1a11hi!", "hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa11hi!11");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "11hi!1hi!1ahi!1ahi!aa1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11aahi!1ahi!aa11hi!11hi!1a11hi!hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa11hi!11" + "'", str2.equals("11hi!1hi!1ahi!1ahi!aa1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11aahi!1ahi!aa11hi!11hi!1a11hi!hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa11hi!11"));
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test515");
        boolean boolean2 = RegExpMatcher.matches("hi!1a11hi!11hi!1a11hi!11a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa1hi!1a11hi!11aahi!1ahi!aa11hi!aa11hi!11hi!1a", "a11");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test516");
        boolean boolean2 = RegExpMatcher.matches("11hi!aa11hi!11hi!1a", "hi!hi!1ahi!1ahi!aa1a11hi!1a1111hi!1hi!1ahi!1ahi!aahi!1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aa11hi!11hi!11aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test517");
        String str2 = RegExpMatcher.makeConcatenation("ahi!1a", "11hi!1ahi!1ahi!aa1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11aahi!1ahi!aa11hi!11hi!1a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "ahi!1a11hi!1ahi!1ahi!aa1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11aahi!1ahi!aa11hi!11hi!1a" + "'", str2.equals("ahi!1a11hi!1ahi!1ahi!aa1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11aahi!1ahi!aa11hi!11hi!1a"));
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test518");
        boolean boolean2 = RegExpMatcher.matches("1hi!1a11hi!11aahi!1ahi!aa", "11hi!hi!1a11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test519");
        String str2 = RegExpMatcher.makeConcatenation("a111", "1a11hi!1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a1111a11hi!1" + "'", str2.equals("a1111a11hi!1"));
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test520");
        boolean boolean2 = RegExpMatcher.matches("a11", "11hi!1hi!1ahi!1ahi!aa1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11aahi!1ahi!aa11hi!11hi!1a11hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test521");
        String str2 = RegExpMatcher.makeConcatenation("1aahi!1ahi!1a11hi!11aahi!1a11hi!11", "1aahi!1ahi!1a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1aahi!1ahi!1a11hi!11aahi!1a11hi!111aahi!1ahi!1a" + "'", str2.equals("1aahi!1ahi!1a11hi!11aahi!1a11hi!111aahi!1ahi!1a"));
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test522");
        String str2 = RegExpMatcher.makeConcatenation("hi!1a11hi!11hi!1a11hi!11hi!hi!1ahi!1ahi!aa", "a111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11hi!1a11hi!11hi!aahi!aahi!1a11hi!11hi!1ahi!aaahi!1a11hi!11hi!1a11hi!11hi!1a11hi!1a11hi!1ahi!1ahi!aa1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11aahi!1ahi!aa11hi!11hi!1a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!1a11hi!11hi!1a11hi!11hi!hi!1ahi!1ahi!aaa111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11hi!1a11hi!11hi!aahi!aahi!1a11hi!11hi!1ahi!aaahi!1a11hi!11hi!1a11hi!11hi!1a11hi!1a11hi!1ahi!1ahi!aa1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11aahi!1ahi!aa11hi!11hi!1a" + "'", str2.equals("hi!1a11hi!11hi!1a11hi!11hi!hi!1ahi!1ahi!aaa111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11hi!1a11hi!11hi!aahi!aahi!1a11hi!11hi!1ahi!aaahi!1a11hi!11hi!1a11hi!11hi!1a11hi!1a11hi!1ahi!1ahi!aa1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11aahi!1ahi!aa11hi!11hi!1a"));
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test523");
        boolean boolean2 = RegExpMatcher.matches("11hi!1hi!1ahi!1ahi!aahi!", "11hi!1hi!1ahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!aahi!1a11hi!11hi!1ahi!aaahi!1a11hi!11hi!1a11hi!11hi!1a11hi!1a11");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test524");
        boolean boolean2 = RegExpMatcher.matches("11hi!1hi!1ahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!aahi!1a11hi!11hi!1ahi!aaahi!1a11hi!11hi!1a11hi!11hi!1a11hi!1a11", "11hi!hi!1a11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test525");
        boolean boolean2 = RegExpMatcher.matches("11hi!ahi!1ahi!1ahi!1a11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa1a11hi!1", "hi!1a1ahi!1a11hi!11aahi!1ahi!aa111hi!1hi!1ahi!1ahi!aa1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11aahi!1ahi!aa11hi!11hi!1ahi!1a11hi!11hi!1a11hi!11a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa1hi!1a11hi!11aahi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test526");
        boolean boolean2 = RegExpMatcher.matches("hi!1a11hi!11hi!1a11hi!11hi!aa", "1hi!1a11hi!11aahi!1ahi!aa11hi!ahi!1a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test527");
        boolean boolean2 = RegExpMatcher.matches("1hi!1a11hi!11aahi!1ahi!aa11hi!11hi!1aa111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aa", "11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!111hi!1hi!1ahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aa11hi!11");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test528");
        String str2 = RegExpMatcher.makeConcatenation("hi!1a11hi!11hi!1ahi!aaahi!1a11hi!11hi!1ahi!aa11hi!111hi!1a11hi!11aahi!1ahi!aa11hi!11hi!1aa111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!hi!1a11hi!11hi!1ahi!aahi!1a11hi!11hi!1a11hi!11a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa", "hi!1ahi!aahi!1a11hi!11hi!1a11hi!11hi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!1a11hi!11hi!1ahi!aaahi!1a11hi!11hi!1ahi!aa11hi!111hi!1a11hi!11aahi!1ahi!aa11hi!11hi!1aa111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!hi!1a11hi!11hi!1ahi!aahi!1a11hi!11hi!1a11hi!11a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaahi!1ahi!aahi!1a11hi!11hi!1a11hi!11hi!aa" + "'", str2.equals("hi!1a11hi!11hi!1ahi!aaahi!1a11hi!11hi!1ahi!aa11hi!111hi!1a11hi!11aahi!1ahi!aa11hi!11hi!1aa111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!hi!1a11hi!11hi!1ahi!aahi!1a11hi!11hi!1a11hi!11a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaahi!1ahi!aahi!1a11hi!11hi!1a11hi!11hi!aa"));
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test529");
        String str2 = RegExpMatcher.makeConcatenation("1aahi!1ahi!1a11hi!11aahi!1a11hi!11aa", "11hi!1hi!1ahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!aahi!1a11hi!11hi!1ahi!aaahi!1a11hi!11hi!1a11hi!11hi!1a11hi!1a11");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1aahi!1ahi!1a11hi!11aahi!1a11hi!11aa11hi!1hi!1ahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!aahi!1a11hi!11hi!1ahi!aaahi!1a11hi!11hi!1a11hi!11hi!1a11hi!1a11" + "'", str2.equals("1aahi!1ahi!1a11hi!11aahi!1a11hi!11aa11hi!1hi!1ahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!aahi!1a11hi!11hi!1ahi!aaahi!1a11hi!11hi!1a11hi!11hi!1a11hi!1a11"));
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test530");
        boolean boolean2 = RegExpMatcher.matches("1a", "hi!1a11hi!11hi!1a11hi!11hi!hi!1ahi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test531");
        String str2 = RegExpMatcher.makeConcatenation("hi!1ahi!aa", "hi!1a11hi!11hi!1ahi!aaahi!1a11hi!11hi!1ahi!aaa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!1ahi!aahi!1a11hi!11hi!1ahi!aaahi!1a11hi!11hi!1ahi!aaa" + "'", str2.equals("hi!1ahi!aahi!1a11hi!11hi!1ahi!aaahi!1a11hi!11hi!1ahi!aaa"));
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test532");
        String str2 = RegExpMatcher.makeConcatenation("a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaahi!1a11hi!11aahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!hi!1a11hi!11hi!1ahi!aa11hi!1hi!1ahi!aa", "1aahi!1ahi!1a11hi!11aa1aahi!1ahi!1a1aahi!1ahi!1ahi!1ahi!aaa11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaahi!1a11hi!11aahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!hi!1a11hi!11hi!1ahi!aa11hi!1hi!1ahi!aa1aahi!1ahi!1a11hi!11aa1aahi!1ahi!1a1aahi!1ahi!1ahi!1ahi!aaa11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aa" + "'", str2.equals("a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaahi!1a11hi!11aahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!hi!1a11hi!11hi!1ahi!aa11hi!1hi!1ahi!aa1aahi!1ahi!1a11hi!11aa1aahi!1ahi!1a1aahi!1ahi!1ahi!1ahi!aaa11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aa"));
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test533");
        boolean boolean2 = RegExpMatcher.matches("hi!1a11hi!11hi!1ahi!aaahi!1a11hi!11hi!1a11hi!11hi!1a11hi!1a11", "hi!1a11hi!11hi!1a11hi!1111hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test534");
        String str2 = RegExpMatcher.makeConcatenation("11hi!11", "11hi!1hi!1ahi!1ahi!aa1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11aahi!1ahi!aa11hi!11hi!1ahi!1a11hi!11hi!1ahi!aaahi!1a11hi!11hi!1ahi!aaa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "11hi!1111hi!1hi!1ahi!1ahi!aa1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11aahi!1ahi!aa11hi!11hi!1ahi!1a11hi!11hi!1ahi!aaahi!1a11hi!11hi!1ahi!aaa" + "'", str2.equals("11hi!1111hi!1hi!1ahi!1ahi!aa1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11aahi!1ahi!aa11hi!11hi!1ahi!1a11hi!11hi!1ahi!aaahi!1a11hi!11hi!1ahi!aaa"));
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test535");
        String str2 = RegExpMatcher.makeConcatenation("1a11hi!1", "hi!1a1ahi!1a11hi!11aahi!1ahi!aa111hi!1hi!1ahi!1ahi!aa1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11aahi!1ahi!aa11hi!11hi!1ahi!1a11hi!11hi!1a11hi!11a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa1hi!1a11hi!11aahi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1a11hi!1hi!1a1ahi!1a11hi!11aahi!1ahi!aa111hi!1hi!1ahi!1ahi!aa1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11aahi!1ahi!aa11hi!11hi!1ahi!1a11hi!11hi!1a11hi!11a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa1hi!1a11hi!11aahi!1ahi!aa" + "'", str2.equals("1a11hi!1hi!1a1ahi!1a11hi!11aahi!1ahi!aa111hi!1hi!1ahi!1ahi!aa1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11aahi!1ahi!aa11hi!11hi!1ahi!1a11hi!11hi!1a11hi!11a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa1hi!1a11hi!11aahi!1ahi!aa"));
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test536");
        String str2 = RegExpMatcher.makeConcatenation("11hi!1hi!1ahi!1ahi!aa", "11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!hi!1a11hi!11hi!1ahi!aa11hi!1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "11hi!1hi!1ahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!hi!1a11hi!11hi!1ahi!aa11hi!1" + "'", str2.equals("11hi!1hi!1ahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!hi!1a11hi!11hi!1ahi!aa11hi!1"));
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test537");
        String str2 = RegExpMatcher.makeConcatenation("hi!1ahi!1ahi!aa1a11hi!1a1111hi!1hi!1ahi!1ahi!aahi!", "11hi!11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!hi!1a11hi!11hi!1ahi!aa11hi!1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!1ahi!1ahi!aa1a11hi!1a1111hi!1hi!1ahi!1ahi!aahi!11hi!11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!hi!1a11hi!11hi!1ahi!aa11hi!1" + "'", str2.equals("hi!1ahi!1ahi!aa1a11hi!1a1111hi!1hi!1ahi!1ahi!aahi!11hi!11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!hi!1a11hi!11hi!1ahi!aa11hi!1"));
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test538");
        String str2 = RegExpMatcher.makeConcatenation("1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1ahi!hi!1a11hi!11aahi!1ahi!aaaahi!1a11hi!11hi!1a11hi!11a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa1hi!1a11hi!11aahi!1ahi!aa11hi!aa11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa", "aaa11");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1ahi!hi!1a11hi!11aahi!1ahi!aaaahi!1a11hi!11hi!1a11hi!11a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa1hi!1a11hi!11aahi!1ahi!aa11hi!aa11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaaa11" + "'", str2.equals("1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1ahi!hi!1a11hi!11aahi!1ahi!aaaahi!1a11hi!11hi!1a11hi!11a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa1hi!1a11hi!11aahi!1ahi!aa11hi!aa11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaaa11"));
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test539");
        String str2 = RegExpMatcher.makeConcatenation("a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaahi!1a11hi!11aahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!hi!1a11hi!11hi!1ahi!aa11hi!1hi!1ahi!aa1aahi!1ahi!1a11hi!11aa1aahi!1ahi!1a1aahi!1ahi!1ahi!1ahi!aaa11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aa", "a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaahi!1a11hi!11aahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!hi!1a11hi!11hi!1ahi!aa11hi!1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaahi!1a11hi!11aahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!hi!1a11hi!11hi!1ahi!aa11hi!1hi!1ahi!aa1aahi!1ahi!1a11hi!11aa1aahi!1ahi!1a1aahi!1ahi!1ahi!1ahi!aaa11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aaa11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaahi!1a11hi!11aahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!hi!1a11hi!11hi!1ahi!aa11hi!1" + "'", str2.equals("a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaahi!1a11hi!11aahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!hi!1a11hi!11hi!1ahi!aa11hi!1hi!1ahi!aa1aahi!1ahi!1a11hi!11aa1aahi!1ahi!1a1aahi!1ahi!1ahi!1ahi!aaa11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aaa11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaahi!1a11hi!11aahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!hi!1a11hi!11hi!1ahi!aa11hi!1"));
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test540");
        boolean boolean2 = RegExpMatcher.matches("1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1ahi!hi!1a11hi!11aahi!1ahi!aaaahi!1a11hi!11hi!1a11hi!11a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa1hi!1a11hi!11aahi!1ahi!aa11hi!aa11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aahi!1a11hi!11hi!1ahi!aaahi!1a11hi!11hi!1ahi!aa11hi!11", "hi!1a11hi!11hi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test541");
        String str2 = RegExpMatcher.makeConcatenation("1aahi!1ahi!1a11hi!11aa1aahi!1ahi!1a1aahi!1ahi!1a", "1aahi!1ahi!1a11hi!11aa1aahi!1ahi!1a1aahi!1ahi!1ahi!1ahi!aaa11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1aahi!1ahi!1a11hi!11aa1aahi!1ahi!1a1aahi!1ahi!1a1aahi!1ahi!1a11hi!11aa1aahi!1ahi!1a1aahi!1ahi!1ahi!1ahi!aaa11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aa" + "'", str2.equals("1aahi!1ahi!1a11hi!11aa1aahi!1ahi!1a1aahi!1ahi!1a1aahi!1ahi!1a11hi!11aa1aahi!1ahi!1a1aahi!1ahi!1ahi!1ahi!aaa11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aa"));
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test542");
        boolean boolean2 = RegExpMatcher.matches("a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaahi!1a11hi!11aahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!hi!1a11hi!11hi!1ahi!aa11hi!1hi!1ahi!aa1aahi!1ahi!1a11hi!11aa1aahi!1ahi!1a1aahi!1ahi!1ahi!1ahi!aaa11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aa", "1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11aahi!1ahi!aa11hi!11hi!1a11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!hi!1a11hi!11hi!1ahi!aahi!1a11hi!11hi!1a11hi!11a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test543");
        boolean boolean2 = RegExpMatcher.matches("11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!hi!1a11hi!11hi!1ahi!aahi!1a11hi!11hi!1a11hi!11a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa", "1aahi!1ahi!1a11hi!11aahi!1a11hi!111aahi!1ahi!1a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test544");
        String str2 = RegExpMatcher.makeConcatenation("hi!1ahi!1ahi!aa1a11hi!1a11", "hi!1a11hi!11hi!1ahi!aaahi!1a11hi!11hi!1ahi!aa11hi!11");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!1ahi!1ahi!aa1a11hi!1a11hi!1a11hi!11hi!1ahi!aaahi!1a11hi!11hi!1ahi!aa11hi!11" + "'", str2.equals("hi!1ahi!1ahi!aa1a11hi!1a11hi!1a11hi!11hi!1ahi!aaahi!1a11hi!11hi!1ahi!aa11hi!11"));
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test545");
        String str2 = RegExpMatcher.makeConcatenation("hi!1ahi!hi!1a11hi!11aahi!1ahi!aa1a11hi!hi!1a11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa", "11hi!1hi!1ahi!1ahi!aa1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11aahi!1ahi!aa11hi!11hi!1a11hi!hi!1ahi!1ahi!aa1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11aahi!1ahi!aa11hi!11hi!1a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!1ahi!hi!1a11hi!11aahi!1ahi!aa1a11hi!hi!1a11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa11hi!1hi!1ahi!1ahi!aa1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11aahi!1ahi!aa11hi!11hi!1a11hi!hi!1ahi!1ahi!aa1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11aahi!1ahi!aa11hi!11hi!1a" + "'", str2.equals("hi!1ahi!hi!1a11hi!11aahi!1ahi!aa1a11hi!hi!1a11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa11hi!1hi!1ahi!1ahi!aa1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11aahi!1ahi!aa11hi!11hi!1a11hi!hi!1ahi!1ahi!aa1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11aahi!1ahi!aa11hi!11hi!1a"));
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test546");
        String str2 = RegExpMatcher.makeConcatenation("11hi!11hi!1a", "1a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "11hi!11hi!1a1a" + "'", str2.equals("11hi!11hi!1a1a"));
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test547");
        boolean boolean2 = RegExpMatcher.matches("1a11hi!1hi!1a11hi!11hi!1a11hi!11a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaahi!1a11hi!11hi!1ahi!aa11hi!11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aa", "1hi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test548");
        boolean boolean2 = RegExpMatcher.matches("hi!1a11hi!11hi!1a11hi!11hi!hi!1ahi!1ahi!aa", "hi!1a11hi!11hi!1a11hi!11a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaahi!1a11hi!11hi!1a11hi!11a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa1hi!1a11hi!11aahi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test549");
        boolean boolean2 = RegExpMatcher.matches("11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!hi!1a11hi!11hi!1ahi!aa1hi!1a11hi!11aahi!1ahi!aa11hi!11hi!1aa111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11hi!1a11hi!11hi!1a11hi!1a11", "11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!hi!1a11hi!11hi!1ahi!aa11hi!1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test550");
        String str2 = RegExpMatcher.makeConcatenation("1hi!1a11hi!11aahi!1ahi!aa11hi!ahi!1a", "hi!1ahi!hi!1a11hi!11aahi!1ahi!aaa111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aaa111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1hi!1a11hi!11aahi!1ahi!aa11hi!ahi!1ahi!1ahi!hi!1a11hi!11aahi!1ahi!aaa111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aaa111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aa" + "'", str2.equals("1hi!1a11hi!11aahi!1ahi!aa11hi!ahi!1ahi!1ahi!hi!1a11hi!11aahi!1ahi!aaa111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aaa111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aa"));
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test551");
        boolean boolean2 = RegExpMatcher.matches("1a11hi!1hi!1a11hi!11hi!1a11hi!11a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaahi!1a11hi!11hi!1ahi!aa11hi!11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aa", "a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaahi!1a11hi!11aahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!hi!1a11hi!11hi!1ahi!aa11hi!1hi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test552");
        String str2 = RegExpMatcher.makeConcatenation("11hi!1hi!1ahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!aahi!1a11hi!11hi!1ahi!aaahi!1a11hi!11hi!1a11hi!11hi!1a11hi!1a11hi!1a11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa1a", "hi!hi!1ahi!1ahi!aa1a11hi!1a1111hi!1hi!1ahi!1ahi!aahi!1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aa11hi!11hi!1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "11hi!1hi!1ahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!aahi!1a11hi!11hi!1ahi!aaahi!1a11hi!11hi!1a11hi!11hi!1a11hi!1a11hi!1a11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa1ahi!hi!1ahi!1ahi!aa1a11hi!1a1111hi!1hi!1ahi!1ahi!aahi!1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aa11hi!11hi!1" + "'", str2.equals("11hi!1hi!1ahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!aahi!1a11hi!11hi!1ahi!aaahi!1a11hi!11hi!1a11hi!11hi!1a11hi!1a11hi!1a11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa1ahi!hi!1ahi!1ahi!aa1a11hi!1a1111hi!1hi!1ahi!1ahi!aahi!1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aa11hi!11hi!1"));
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test553");
        String str2 = RegExpMatcher.makeConcatenation("1aahi!1ahi!1a11hi!11aa1aahi!1ahi!1a1aahi!1ahi!1ahi!1ahi!aaa11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1ahi!aaa11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aa11hi!aa", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1aahi!1ahi!1a11hi!11aa1aahi!1ahi!1a1aahi!1ahi!1ahi!1ahi!aaa11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1ahi!aaa11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aa11hi!aa" + "'", str2.equals("1aahi!1ahi!1a11hi!11aa1aahi!1ahi!1a1aahi!1ahi!1ahi!1ahi!aaa11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1ahi!aaa11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aa11hi!aa"));
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test554");
        String str2 = RegExpMatcher.makeConcatenation("11hi!11hi!1a11hi!11aahi!1ahi!aa11hi!11hi!1aa111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aa1a", "11hi!aa11hi!11hi!1a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "11hi!11hi!1a11hi!11aahi!1ahi!aa11hi!11hi!1aa111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aa1a11hi!aa11hi!11hi!1a" + "'", str2.equals("11hi!11hi!1a11hi!11aahi!1ahi!aa11hi!11hi!1aa111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aa1a11hi!aa11hi!11hi!1a"));
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test555");
        boolean boolean2 = RegExpMatcher.matches("hi!1ahi!aaa11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aa", "hi!1a11hi!11hi!1a11hi!11a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa1hi!1a11hi!11aahi!1ahi!aa11hi!aa11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test556");
        boolean boolean2 = RegExpMatcher.matches("hi!1ahi!hi!1a11hi!11aahi!1ahi!aaa111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aaa111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aa", "aaa111aahi!1ahi!1a11hi!11aa1aahi!1ahi!1a11hi!11hi!11hi!1a11hi!11aahi!1ahi!aa11hi!11hi!1aa111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test557");
        boolean boolean2 = RegExpMatcher.matches("1aahi!1ahi!1a11hi!11aahi!1a11hi!11hi!1ahi!aa11hi!", "hi!1a11hi!11hi!1ahi!aaahi!1a11hi!11hi!1ahi!aa11hi!11");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test558");
        String str2 = RegExpMatcher.makeConcatenation("aa", "hi!aahi!1a11hi!11hi!1ahi!aaahi!1a11hi!11hi!1a11hi!11hi!1a11hi!1a11a11");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "aahi!aahi!1a11hi!11hi!1ahi!aaahi!1a11hi!11hi!1a11hi!11hi!1a11hi!1a11a11" + "'", str2.equals("aahi!aahi!1a11hi!11hi!1ahi!aaahi!1a11hi!11hi!1a11hi!11hi!1a11hi!1a11a11"));
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test559");
        boolean boolean2 = RegExpMatcher.matches("11hi!11hi!1a11hi!11aahi!1ahi!aa11hi!11hi!1aa111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aa", "1a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test560");
        boolean boolean2 = RegExpMatcher.matches("a111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11aa1a11hi!111hi!1hi!1ahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aa", "hi!1ahi!1ahi!aa1a11hi!1a111aahi!1ahi!1a11hi!11aahi!1a11hi!11aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test561");
        boolean boolean2 = RegExpMatcher.matches("hi!1ahi!aaa11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa", "11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!hi!1a11hi!11hi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test562");
        boolean boolean2 = RegExpMatcher.matches("hi!1a11hi!11aahi!1ahi!aa", "hi!1ahi!1ahi!aa1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11aahi!1ahi!aa11hi!11hi!1a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test563");
        boolean boolean2 = RegExpMatcher.matches("hi!1a11hi!11hi!1a11hi!11hi!1a11hi!1a11hi!1a11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa", "hi!1a11hi!11aahi!1ahi!aa11hi!11hi!1aa111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test564");
        boolean boolean2 = RegExpMatcher.matches("1hi!1a11hi!11aahi!1ahi!aa11hi!ahi!1a", "a111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11aahi!1a11hi!11hi!1a11hi!11hi!1a11hi!1a11hi!1a11hi!11hi!1a11hi!11hi!1a11hi!1a11hi!1a11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test565");
        String str2 = RegExpMatcher.makeConcatenation("11hi!1hi!1ahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!hi!1a11hi!11hi!1ahi!aa11hi!1", "hi!hi!1a11hi!11aahi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "11hi!1hi!1ahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!hi!1a11hi!11hi!1ahi!aa11hi!1hi!hi!1a11hi!11aahi!1ahi!aa" + "'", str2.equals("11hi!1hi!1ahi!1ahi!aa11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aahi!hi!1a11hi!11hi!1ahi!aa11hi!1hi!hi!1a11hi!11aahi!1ahi!aa"));
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test566");
        boolean boolean2 = RegExpMatcher.matches("hi!1a11hi!11hi!1ahi!aaahi!1a11hi!11hi!1a11hi!11hi!1a11hi!1a11", "hi!1a11hi!11hi!1a11hi!11hi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test567");
        boolean boolean2 = RegExpMatcher.matches("hi!1a11hi!11aahi!1ahi!aa11hi!11hi!1a", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test568");
        String str2 = RegExpMatcher.makeConcatenation("11hi!11hi!1a11hi!11aahi!1ahi!aa11hi!11hi!1aa111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aa", "11hi!1hi!1ahi!1ahi!aa1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11aahi!1ahi!aa11hi!11hi!1a11hi!hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa11hi!11");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "11hi!11hi!1a11hi!11aahi!1ahi!aa11hi!11hi!1aa111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aa11hi!1hi!1ahi!1ahi!aa1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11aahi!1ahi!aa11hi!11hi!1a11hi!hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa11hi!11" + "'", str2.equals("11hi!11hi!1a11hi!11aahi!1ahi!aa11hi!11hi!1aa111aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aa11hi!1hi!1ahi!1ahi!aa1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aahi!1a11hi!11aahi!1ahi!aa11hi!11hi!1a11hi!hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa11hi!11"));
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test569");
        boolean boolean2 = RegExpMatcher.matches("hi!hi!1ahi!1ahi!aa1a11hi!1a1111hi!1hi!1ahi!1ahi!aahi!1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aa11hi!11hi!11aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aa", "hi!1a11hi!11hi!1a11hi!1111hi!1hi!1a11hi!11hi!1a11hi!11");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }
}

