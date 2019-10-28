![](image/affrep.png)

# Modul Praktikum Dasar Pemrograman

**Modul Praktikum Dasar Pemrograman menggunakan bahasa pemrograman Java**. Modul ini digunakan sebagai materi tambahan atau praktikum pada mata kuliah Dasar Pemrograman. 

> Dibuat dan dikelola oleh **Muhammad Affandes, M.T.** ([affandes@uin-suska.ac.id](mailto:affandes@uin-suska.ac.id))



## Silabus

Berikut adalah silabus yang digunakan di dalam modul praktikum ini.

1. **Pendahuluan**,  bagian ini berisi materi tentang dasar-dasar menampilkan teks pada layar, serta konsep komentar di dalam pemrograman.
2. **Variabel dan Tipe Data**, bagian ini berisi materi tentang variabel serta cara menggunakan variabel, jenis-jenis tipe data serta cara penggunaan masing-masing tipe data tersebut.
3. **Operator**, bagian ini berisi materi tentang beberapa operator penting yang biasa digunakan pada Java serta cara penggunaan masing-masing operator tersebut.
4. **Input dan Output**, bagian ini berisi tentang teknik dasar input dan output pada Java. Input meliputi keyboard dan file, sedangkan output meliputi layar monitor dan file.
5. **Percabangan**, bagian ini berisi tentang konsep percabangan menggunakan if dan switch.
6. **Perulangan**, bagian ini berisi tentang konsep perulangan menggunakan for dan while.



## Daftar Isi

[TOC]



## 1. Pendahuluan

Pada bagian ini mahasiswa diharapkan mampu memahami bagaimana membuat program menggunakan Java dengan bantuan aplikasi text editor atau IDE (Integrated Development Environment).

### 1.1 Program Salam

Jalankan program berikut ini.

```java
public class Salam {
    public static void main(String[] args) {
        System.out.println("Salam Programmer");
    }
}
```

Apabila program di atas dijalankan akan menampilkan kalimat "Salam Programmer" pada layar output program seperti berikut.

```bash
Salam Programmer
```

Untuk menjalankan program tersebut, anda harus menyimpan skrip program tersebut pada file dengan nama ```Salam.java``` kemudian di compile dan di jalankan.

### 1.2 Tanda Kutip

Setiap String atau teks pada Java harus diapit oleh tanda kutip-dua (double quote). Dengan demikian, untuk mencetak tanda kutip-dua diperlukan karakter khusus yang disebut dengan escape-character.

Jalankan program berikut ini.

```java
public class KutipSatu {
    public static void main(String[] args) {
        System.out.println("Nama Isma'il menggunakan tanda kutip satu.");
    }
}
```

Jalankan program berikut ini.

```java
public class KutipDua {
    public static void main(String[] args) {
        System.out.println("Budi berkata, \"Hari ini kita belajar Java.\" kepada Dodi.");
    }
}
```

Perhatikan output yang dihasilkan oleh kedua program tersebut.

### 1.3 Komentar

Komentar pada pemrograman digunakan untuk memberikan catatan dan dokumentasi yang berkenaan dengan skrip program tersebut. Komentar dapat ditulis dengan bahasa sehari-hari dan tidak diproses oleh program.

Jalankan dan perhatikan program berikut ini.

```java
public class Komentar01 {
    public static void main(String[] args) {
        // Ini adalah komentar

        /* Setiap komentar tidak akan diproses */

        /*
         * Komentar juga dapat ditulis lebih dari
         * satu baris. Berapapun banyaknya komentar
         * tetap tidak akan diproses. Sekalipun
         * diisi dengan koding. Misalnya:
         *
         * System.out.println("Tidak ditampilkan");
         */
        System.out.println("Ok, mengerti");
    }
}
```

### 1.4 Latihan 1

Salinlah kode berikut di bawah ini kemudian jalankan. Perhatikan output yang dihasilkan.

1. Program Kalimat 1

   ```java
   public class Kalimat1 {
       public static void main(String[] args) {
           System.out.println("Ini kalimat 1");
           System.out.println("Ini kalimat 2");
           System.out.println("Ini kalimat 3");
       }
   }
   ```

   

2. Program Kalimat 2

   ```java
   public class Kalimat2 {
       public static void main(String[] args) {
           System.out.print("Ini kalimat 1");
           System.out.print("Ini kalimat 2");
           System.out.print("Ini kalimat 3");
       }
   }
   ```

   

3. Program Kalimat 3

   ```java
   public class Kalimat3 {
       public static void main(String[] args) {
           System.out.println("Ini kalimat 1 \n Ini kalimat 2 \n Ini kalimat 3");
       }
   }
   ```

   

4. Program Kalimat 4

   ```java
   public class Kalimat4 {
       public static void main(String[] args) {
           System.out.println("Ini kalimat 1");
           System.out.print("Ini kalimat 2");
           System.out.println("Ini kalimat 3");
           System.out.print("Ini kalimat 4");
           System.out.println("Ini kalimat 5");
       }
   }
   ```

   

### 1.5 Latihan 2

Salinlah kode berikut di bawah ini kemudian jalankan. Perhatikan output yang dihasilkan.

1. Program Tanda Kutip

   ```java
   public class TandaKutip {
       public static void main(String[] args) {
           System.out.println("Al Qur'an dan Hadist");
           System.out.println("Sesuai Syari'at");
           System.out.println("Surat Al Waqi'ah");
       }
   }
   ```

   

2. Program Tanda Kutip-Dua

   ```java
   public class TandaKutipDua {
       public static void main(String[] args) {
           System.out.println("Kata \"computer\" berasal dari kata \"compute\" yang berarti menghitung.");
       }
   }
   ```

   

3. Program Biodata

   ```java
   public class Biodata {
       public static void main(String[] args) {
           System.out.println("Nama \t : Muhammad Affandes");
           System.out.println("Email \t : affandes@uin-suska.ac.id");
       }
   }
   ```

   

4. Program Skrip

   ```java
   public class Skrip {
       public static void main(String[] args) {
           System.out.println("System.out.println(\"Salam\"); => Salam");
       }
   }
   ```

   

### 1.6 Latihan 3

Buatlah program yang menghasilkan output seperti di bawah ini.

1. Output 1

   ```bash
   Andi 	: “Assalammu’alaikum”.
   Budi 	: “Wa’alaikumsalam”.
   Andi 	: “Bagaimana kabarnya?”.
   Budi 	: “Luar biasa, Alhamdulillah”.
   ```

   

2. Output 2

   ```bas
   Citra	: “Ded, hari ini kita kuliah apa?”.
   Dedi 	: “Kuliah ‘Dasar Pemrograman’, Cit”.
   Citra	: “Lho, kuliah ‘Al Qur’an dan Hadits’ kapan?”.
   Dedi	: “Besok, Cit”.
   ```

   

3. Output 3

   ```bas
   *====================*
   | Selamat Belajar    |
   | Dasar Pemrograman  |
   | Menggunakan Java   |
   *====================*
   ```



### 1.7 Latihan 4

Salinlah kode berikut di bawah ini kemudian jalankan. Perhatikan output yang dihasilkan.

1. Program Komentar 1

   ```java
   public class KomentarKalimat1 {
       public static void main(String[] args) {
           System.out.println("Baris ke 1");
           // System.out.println("Baris ke 2");
           System.out.println("Baris ke 3");
           System.out.println("Baris ke 4");
       }
   }
   ```

   

2. Program Komentar 2

   ```java
   public class KomentarKalimat2 {
       public static void main(String[] args) {
           System.out.println("Baris ke 1");
           /* System.out.println("Baris ke 2"); */
           System.out.println("Baris ke 3");
           System.out.println("Baris ke 4");
       }
   }
   ```

   

3. Program Komentar 3

   ```java
   public class KomentarKalimat3 {
       public static void main(String[] args) {
           System.out.println("Baris ke 1");
           /* System.out.println("Baris ke 2");
           System.out.println("Baris ke 3");
           System.out.println("Baris ke 4"); */
       }
   }
   ```

   

4. Program Komentar 4

   ```java
   public class KomentarKalimat4 {
       public static void main(String[] args) {
           System.out.println("Baris ke 1");
           System.out.println("Baris ke 2"); /* komentar 1 */
           System.out.println("Baris ke 3"); // komentar 2
           System.out.println("Baris ke 4");
       }
   }
   ```

   

5. Program Komentar 5

   ```jav
   public class KomentarKalimat5 {
       public static void main(String[] args) {
           // Skrip untuk menampilkan Baris
           System.out.println("Baris ke 1");
           System.out.println("Baris ke 2");
           System.out.println("Baris ke 3");
           // Skrip untuk menampilkan Kalimat
           System.out.println("Kalimat ke 1");
           System.out.println("Kalimat ke 2");
           System.out.println("Kalimat ke 3");
       }
   }
   ```

   

### 1.8 Latihan 5

Salinlah kode berikut di bawah ini kemudian jalankan. Perhatikan output yang dihasilkan.

Program Kotak Biodata

```java
public class KotakBiodata {
    public static void main(String[] args) {
        /*
         * Ini adalah skrip program untuk menampilkan biodata saya.
         * Author : Muhammad Affandes
         * Email  : affandes@uin-suska.ac.id
         * Create : July 30, 2016 17:19:26
         */
        System.out.println("===========================================");
        System.out.println(" Biodata Saya ");
        System.out.println("-------------------------------------------");
        System.out.println(" Nama \t : Muhammad Affandes");
        System.out.println(" Email \t : affandes@uin-suska.ac.id");
        System.out.println("===========================================");
    }
}
```



## 2. Variabel dan Tipe Data

Pada bagian ini mahasiswa akan mempelajari tentang variabel dan tipe data pada Java. Pembahasan dibagi menjadi 2 (dua), yaitu variabel dan tipe data.

### 2.1 Variabel

Variabel pada pemrograman Java merupakan sesuatu yang dapat digunakan untuk menyimpan data atau nilai. Nilai yang disimpan dapat digunakan kembali untuk proses pada pemrograman.

### 2.2 Latihan 1

Salinlah kode di bawah ini. Kemudian perhatikan hasilnya!

1. Program Var 1

   ```java
   public class Var01 {
       public static void main(String[] args) {
           String nama = "Budi";
           System.out.println("Hai " + nama);
       }
   }
   ```

2. Program Var 2

   ```java
   public class Var02 {
       public static void main(String[] args) {
           String nama = "Budi";
           System.out.print("Hai ");
           System.out.println(nama);
       }
   }
   ```

3. Program Var 3

   ```java
   public class Var03 {
       public static void main(String[] args) {
           String nama = "Budi";
           System.out.println("Selamat ya " + nama);
           System.out.println("Kamu sudah bisa menggunakan variabel");
       }
   }
   ```

   

4. Program Var 4

   ```java
   public class Var04 {
       public static void main(String[] args) {
           String nama = "Budi";
           System.out.println("Hai " + nama + ", ini adalah baris pertama.");
           System.out.println("Tapi, ini adalah baris kedua.");
           System.out.println("Apakah kamu mengerti, " + nama);
       }
   }
   ```

   

### 2.3 Tipe Data

Tipe data juga disebut dengan jenis data. Data yang disimpan pada variabel memiliki jenis-jenis tertentu. Ada tipe data primitif dan tipe data non-primitif.

#### 2.3.1 Tipe Data Primitif

Tipe data primitif terdiri dari tipe data angka dan boolean.

1. Tipe data Angka, terdiri dari
   1. Integer
      1. Long
      2. Int
      3. Short
      4. Byte
   2. Real
      1. Float
      2. Double
   3. Character
      1. Char
2. Tipe data Boolean
   1. Boolean

#### 2.3.2 Tipe Data Non-Primitif

Tipe data non-primitif terdiri dari tipe data yang berasal dari class, baik class yang dibuat maupun class yang sudah ada di dalam JDK. Contoh tipe data non-primitif adalah: 

1. String
2. Array, dsb

### 2.4 Latihan 2

Salinlah kode di bawah ini. Kemudian perhatikan hasilnya!

1. Kode TipeData01

   ```java
   public class TipeData01 {    
       public static void main(String[] args) {        
           int nilai_1 = 14;        
           int nilai_2 = 10;        
           System.out.println(nilai_1+nilai_2);    
       }
   }
   ```

2. Kode TipeData02

   ```java
   public class TipeData02 {    
       public static void main(String[] args) {        
           int x = 10;        
           int y = 15;        
           System.out.println(x+y);        
           System.out.println(x-y);        
           System.out.println(x*y);        
           System.out.println(x/y);    
       }
   }
   ```

3. Kode TipeData03

   ```java
   public class TipeData03 {    
       public static void main(String[] args) {        
           int a = 45;        
           int b = 10;        
           System.out.println("Jumlah = " + a+b);        
           System.out.println("Jumlah = " + (a+b));        
           System.out.println(a+b + "kg");        
           System.out.println((a+b) + "kg");    
       }
   }
   ```

4. Kode TipeData04

   ```java
   public class TipeData04 {    
       public static void main(String[] args) {        
           int c = 35;        
           int d = 12;        
           System.out.println("Jumlah C + D = " + (c+d));        
           System.out.println("Jumlah C - D = " + (c-d));        
           System.out.println("Jumlah C x D = " + c*d);        
           System.out.println("Jumlah C : D = " + c/d);    
       }
   }
   ```

5. Kode TipeData05

   ```java
   public class TipeData05 {    
       public static void main(String[] args) {        
           String nama = "Budi";        
           int umur = 19;        
           System.out.println("Hari ini " + nama + " sudah " + umur + " tahun. 😀");    
       }
   }
   ```

6. Kode TipeData06

   ```java
   public class TipeData06 {    
       public static void main(String[] args) {        
           String nama;        
           int umur;        
           nama = "Budi";        
           umur = 19;        
           System.out.println("Hari ini " + nama + " sudah " + umur + " tahun. 😀");    
       }
   }
   ```

7. Kode TipeData07

   ```java
   public class TipeData07 {    
       public static void main(String[] args) {        
           String nama = "Andi";        
           int umur = 21;        
           System.out.println("Hari ini " + nama + " sudah " + umur + " tahun. 😀");
           nama = "Budi";        
           umur = 19;        
           System.out.println("Hari ini " + nama + " sudah " + umur + " tahun. 😀");    
       }
   }
   ```



## 3. Operator

Pada bagian ini mahasiswa akan mempelajari tentang operator pada Java. Operator yang dibahas ada 4 jenis, yaitu: operator aritmatika, increment/decrement, perbandingan dan logika.

### 3.1 Operator Aritmatika

Operator aritmatika adalah operator umum yang biasa digunakan untuk kalkulasi dasar pada matematika, seperti penjumlahan, perkalian dan sebagainya. Perhatikan contoh berikut.

```java
public class Ari01 {    
    public static void main(String[] args) {        
        int a = 6;        
        int b = 9;        
        int c = 12;        
        int hasil1 = a + b - c;        
        int hasil2 = a * b / c;        
        int hasil3 = a + b * c;        
        int hasil4 = a + b % c;        
        int hasil5 = (a + b) / c;        
        int hasil6 = (a + b) % c;        
        System.out.println(hasil1);        
        System.out.println(hasil2);        
        System.out.println(hasil3);        
        System.out.println(hasil4);        
        System.out.println(hasil5);        
        System.out.println(hasil6);    
    }
}
```

### 3.2 Operator Increment dan Decrement

Operator increment dan decrement digunakan untuk memodifikasi nilai variabel menjadi bertambah atau berkurang.

```java
public class Inc01 {    
    public static void main(String[] args) {        
        // Buat variabel awal        
        int a = 0;        
        int b = 0;        
        int c = 9;        
        int d = 9;        
        // Print ke 1        
        System.out.println("Print ke 1");        
        System.out.println("A = " + a++);        
        System.out.println("B = " + ++b);        
        System.out.println("C = " + c--);        
        System.out.println("D = " + --d);    
    }
}
```

### 3.3 Operator Perbandingan

Operator perbandingan adalah operator yang digunakan untuk membandingkan dua variabel atau nilai. Perhatikan contoh berikut.

```java
public class Comp01 {    
    public static void main(String[] args) {        
        int a = 8;        
        int b = 19;        
        int c = 4;        
        int d = 25;        
        boolean hasil1 = a == 8;        
        boolean hasil2 = a > b;        
        boolean hasil3 = c < d;        
        boolean hasil4 = b != d;        
        System.out.println(hasil1);        
        System.out.println(hasil2);        
        System.out.println(hasil3);        
        System.out.println(hasil4);    
    }
}
```

Perhatikan juga contoh berikut.

```java
public class Comp02 {    
    public static void main(String[] args) {        
        int x = 6;        
        int y = 7;        
        int z = 9;        
        boolean hasil1 = x + 4 > y + z;        
        boolean hasil2 = y + x / 2 < z + y /2;        
        boolean hasil3 = x * x > (x + z) * (z - y);        
        System.out.println(hasil1);        
        System.out.println(hasil2);        
        System.out.println(hasil3);    
    }
}
```

Perhatikan juga contoh berikut.

```java
public class Comp03 {    
    public static void main(String[] args) {        
        int x = 9;        
        int y = 10;        
        boolean hasil1 = ++x >= y;        
        boolean hasil2 = x++ <= y++;        
        boolean hasil3 = x-- < --y;        
        boolean hasil4 = x < y;        
        System.out.println(hasil1);        
        System.out.println(hasil2);        
        System.out.println(hasil3);        
        System.out.println(hasil4);    
    }
}
```

### 3.4 Operator Logika

Operator logika digunakan untuk melakukan operasi logika. Perhatikan contoh berikut.

```java
public class Log01 {    
    public static void main(String[] args) {        
        boolean x = false & false;        
        boolean y = false & true;        
        boolean z = true & true;        
        boolean hasil1 = x && y;        
        boolean hasil2 = y && z;        
        boolean hasil3 = z && x;        
        System.out.println("x = " + x);        
        System.out.println("y = " + y);        
        System.out.println("z = " + z);        
        System.out.println(hasil1);        
        System.out.println(hasil2);        
        System.out.println(hasil3);    
    }
}
```

## 4. Input dan Output

Pada bagian ini mahasiswa akan mempelajari tentang mekanisme input dan output pada Java.

### 4.1 Scanner

Scanner digunakan untuk membaca inputan dari keyboard (System.in). Perhatikan contoh berikut.

```java
import java.util.Scanner;
public class Scan01 {    
    public static void main(String[] args) {        
        // Membuat object Scanner, membaca Standard Input        
        Scanner scanner = new Scanner(System.in);        
        // Ambil data dari keyboard        
        String teks = scanner.nextLine();        
        // Cetak data        
        System.out.println("Teks : " + teks);    
    }
}
```

Berikut contoh lain.

```java
import java.util.Scanner;
public class Scan02 {    
    public static void main(String[] args) {        
        Scanner scanner = new Scanner(System.in);        
        System.out.print("Input teks: ");        
        String teks = scanner.nextLine();        
        System.out.println("Output teks = " + teks);    
    }
}
```

### 4.2 BufferedReader

```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Buff01 {    
    public static void main(String[] args) {        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {            
            System.out.print("Input = ");            
            String teks = reader.readLine();            
            System.out.println("Output = " + teks);        
        } catch (IOException e) {            
            System.out.println("Error saat input data. Silahkan coba lagi.");        
        }    
    }
}
```

### 4.3 JOptionPane

```java
import javax.swing.*;

public class Jop01 {    
    public static void main(String[] args) {        
        String nama = JOptionPane.showInputDialog("Input nama lengkap"); 
        System.out.println("Hai " + nama);    
    }
}
```

### 4.4 Input dari File

```java
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Inp01 {    
    public static void main(String[] args) {        
        Path file = Paths.get("src/bab04/code02/data01.txt");        
        try {            
            Scanner scanner = new Scanner(file);            
            System.out.println("Output: " + scanner.nextLine());        
        } catch (IOException e) {            
            System.out.println("File tidak ditemukan.");        
        }    
    }
}
```

### 4.5 Output ke File

```java
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Out01 {    
    public static void main(String[] args) {        
        String teks = "Hai Programmer. Teks ini akan disimpan ke file.";        
        Path file = Paths.get("src/bab04/code02/out01.txt");        
        try {            
            Files.write(file, teks.getBytes());        
        } catch (IOException e) {            
            System.out.println("Error saat menyimpan ke file");        
        }    
    }
}
```

## 5. Percabangan

Pada bagian ini mahasiswa akan mempelajari tentang aliran percabangan yang meliputi if dan switch.

### 5.1 Percabangan If dan If Else

### 5.2 Percabangan Switch Case

## 6. Perulangan

Pada bagian ini mahasiswa akan mempelajari tentang aliran perulangan pada Java yang meliputi for dan while.

### 6.1 Perulangan For

### 6.2 Perulangan While dan Do While

## Lisensi

Lisensi di bawah GNU Public License.

Copyright © 2019 oleh Muhammad Affandes ([affandes@uin-suska.ac.id](mailto:affandes@uin-suska.ac.id))