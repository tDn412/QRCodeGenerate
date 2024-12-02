import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;

import java.io.IOException;
import java.nio.file.Paths;

public class GenerateQRCode {
    public static void main(String[] args) throws WriterException, IOException {
        // URL dẫn đến thông tin sách
        String bookURL = "https://library-system.com/book?isbn=9783161484100";

        // Đường dẫn lưu file QR
        String path = "C:/Users/TU/Desktop/book_qr.png";

        // Tạo mã QR
        BitMatrix matrix = new MultiFormatWriter().encode(bookURL, BarcodeFormat.QR_CODE, 500, 500);
        MatrixToImageWriter.writeToPath(matrix, "png", Paths.get(path));

        System.out.println("Mã QR cho sách đã được tạo thành công!");
    }
}
