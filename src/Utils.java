public class Utils {
        /**
         * @see <a href="https://ultirequiem.com">My site</a>
         * @return A random number between 0 and 100.
         */
        public static int randomNumber() {
                return (int) (Math.random() * 100);
        }

        /**
         * @see <a href="https://ultirequiem.com">My site</a>
         * @return A random number between 0 and max.
         */
        public static int randomNumber(int max) {
                return (int) (Math.random() * max);
        }

        public static int sum(int... numbers) {
                int sum = 0;

                for (int number : numbers) {
                        sum += number;
                }

                return sum;
        }

        public static float sum(float... numbers) {
                float sum = 0;

                for (float number : numbers) {
                        sum += number;
                }

                return sum;
        }

}
