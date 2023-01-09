package srl.neotech.services;

import java.util.Random;

import org.springframework.stereotype.Service;

@Service
public class HomeService {

	public String getImmagine() {
		String urlImmagine  = "";
		Random rnd = new Random();
		int valore = rnd.nextInt(5);
		if (valore == 0) urlImmagine = "https://dealers.porscheitalia.com/storage/uploads/24/202011251729-IMG_0552.jpg";
		if (valore == 1) urlImmagine = "https://cdnwp.dealerk.com/ea42991a/uploads/sites/3/2017/04/img_2928.jpg";
		if (valore == 2) urlImmagine = "https://storage.googleapis.com/fp-media/1/2021/12/Lambo-Dubai.jpg";
		if (valore == 3) urlImmagine = "https://cdnwp.dealerk.com/334bb86c/uploads/sites/8/2016/12/DSC_4435-copia.jpg";
		if (valore == 4) urlImmagine = "https://www.motorionline.com/wp-content/uploads/2017/05/06-showroom-bugatti-uae-dubai-1024x768.jpg";
	return urlImmagine;
	}

}
