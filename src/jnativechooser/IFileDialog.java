package jnativechooser;

import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.win32.W32APIOptions;

public interface IFileDialog extends Library {
    IFileDialog INSTANCE = Native.load("comdlg32", IFileDialog.class, W32APIOptions.DEFAULT_OPTIONS);
    // Métodos nativos podem ser definidos aqui se necessário
}
