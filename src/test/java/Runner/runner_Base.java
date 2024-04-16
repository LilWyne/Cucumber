package Runner;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.base.Base.Base_Class;

public class runner_Base extends Base_Class {
	public static void main(String[] args) throws InterruptedException, IOException {

		driver = new ChromeDriver();

		Get_Url("https://adactinhotelapp.com/");

		WebElement a = driver.findElement(By.xpath("//input[@type='text']"));
		Send_Key(a, "subashsubash");
		WebElement b = driver.findElement(By.xpath("//input[@type='password']"));
		Send_Key(b, "subash20012918");
		WebElement c = driver.findElement(By.xpath("//input[@type='Submit']"));
		Click(c);

		WebElement d = driver.findElement(By.xpath("//select[@name='location']"));
		Click(d);
		DropDown(d, "London");

		WebElement e = driver.findElement(By.xpath("//select[@name='hotels']"));
		Click(e);
		DropDownINT(e, 2);

		WebElement f = driver.findElement(By.xpath("//select[@name='room_type']"));
		Click(f);
		DropDownINT(f, 1);

		WebElement g = driver.findElement(By.xpath("//select[@name='adult_room']"));
		Click(g);
		DropDown(g, "2");

		WebElement h = driver.findElement(By.xpath("//select[@name='child_room']"));
		Click(h);
		DropDownINT(h, 2);

		WebElement i = driver.findElement(By.xpath("//input[@type='submit']"));
		Click(i);

		WebElement j = driver.findElement(By.xpath("//input[@name='radiobutton_0']"));
		Click(j);

		WebElement k = driver.findElement(By.xpath("//input[@name='continue']"));
		Click(k);

		WebElement o = driver.findElement(By.xpath("//input[@name='first_name']"));
		// Click(o);
		Send_Key(o, "ADAM");

		WebElement p = driver.findElement(By.xpath("//input[@name='last_name']"));
		Click(p);
		Send_Key(p, "SMITH");

		WebElement r = driver.findElement(By.xpath("//textarea[@name='address']"));
		Send_Key(r, "31/135,sas st,chennai-600041.");

		WebElement w = driver.findElement(By.xpath("//input[@name='cc_num']"));
		Send_Key(w, "6768909876655431");

		WebElement q = driver.findElement(By.xpath("//select[@name='cc_type']"));
		Click(q);
		DropDownINT(q, 3);

		WebElement z = driver.findElement(By.xpath("//select[@name='cc_exp_month']"));
		Click(z);
		DropDownINT(z, 4);

		WebElement x = driver.findElement(By.xpath("//select[@name='cc_exp_year']"));
		Click(x);
		DropDownINT(x, 8);

		WebElement v = driver.findElement(By.xpath("//input[@name='cc_cvv']"));
		Send_Key(v, "342");

		WebElement n = driver.findElement(By.xpath("//input[@id='book_now']"));
		Click(n);

		WebElement myitinerary = driver.findElement(By.xpath("//a[text()='Booked Itinerary']"));
		Click(myitinerary);

		WebElement cancel = driver.findElement(By.xpath("//input[@value='Cancel Selected']"));
		Click(cancel);

		Thread.sleep(3000);
		alert_accept();

		//LogOut
		WebElement logout = driver.findElement(By.xpath("//input[@name='logout']"));
		Click(logout);

		//ScreenShot
		Screen_Shot();

	}

}


