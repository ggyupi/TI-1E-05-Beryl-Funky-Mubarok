package MINGGU5.latihanPraktikum;
/**
 * Showroom
 */
public class Showroom {
    int[] acceleration;
    int[] top_power;
    public Showroom(int[] acceleration, int[] top_power) {
        this.acceleration = acceleration;
        this.top_power = top_power;
    }
    int akselerasiTertinggi() {
        if (acceleration.length == 1) {
            return acceleration[0];
        }
        return akselerasiTertinggi(acceleration, 0, acceleration.length - 1);
    }
    int akselerasiTertinggi(int[] data, int start, int end) {
        if (start == end) {
            return data[start];
        }
        int mid = (start + end) / 2;
        int left = akselerasiTertinggi(data, start, mid);
        int right = akselerasiTertinggi(data, mid + 1, end);
        if (left > right) {
            return left;
        } else {
            return right;
        }
    }
    int akselerasiTerendah() {
        if (acceleration.length == 1) {
            return acceleration[0];
        }
        return akselerasiTerendah(acceleration, 0, acceleration.length - 1);
    }
    int akselerasiTerendah(int[] data, int start, int end) {
        if (start == end) {
            return data[start];
        }
        int mid = (start + end) / 2;
        int left = akselerasiTerendah(data, start, mid);
        int right = akselerasiTerendah(data, mid + 1, end);
        if (left > right) {
            return right;
        } else {
            return left;
        }
    }
    double top_power_Ratarata() {
        double sum = 0;
        for (int i : top_power) {
            sum += i;
        }
        sum /= top_power.length;
        return sum;
    }
}
