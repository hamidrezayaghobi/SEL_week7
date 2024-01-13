# آزمایش هفتم -  آزمایشگاه مهندسی نرم‌افزار
اعضای گروه: علیرضا حیدری 98109731، حمیدرضا یعقوبی 98109786
# گزارش مراحل انجام آزمایش
## بخش اول - اجرا json-simple
در این مرحله دقیقا مطابق مراحل توضیح داده شده در آزمایش، پروژه را راه اندازی می کنیم و تست کاورج می گیریم. در تصویر زیر می توانید نتیجه اجرا را مشاهده کنید.
![image](https://github.com/hamidrezayaghobi/SEL_week7/assets/59170724/905f6ee0-30b5-4a50-b1b6-73bb3404c642)
همینطور اگر پوشه پروژه رو باز کنیم هم می توانیم درصد تست کاورج و اطلاعاتش رو برای هر بخش مشاهده کنیم مطابق عکس زیر:
![image](https://github.com/hamidrezayaghobi/SEL_week7/assets/59170724/70c75fa7-c4ff-425f-8b75-8a0b7f60d9f3)
مطابق شکل زیر هم میتوانیم خروجی HTML بگیریم:

![image](https://github.com/hamidrezayaghobi/SEL_week7/assets/59170724/ac188cab-7ea4-4279-917e-3a4fbc70ff3b)

و به این شکل نتیجه رو بررسی کنیم:
![image](https://github.com/hamidrezayaghobi/SEL_week7/assets/59170724/172752a0-16b2-49f0-834c-967e0d99db28)
![image](https://github.com/hamidrezayaghobi/SEL_week7/assets/59170724/780cba81-9f4d-4bd0-8e43-e06ab53e1931)

## بخش دوم - ‫‪CodeCoverage
بخش بخش کدهارو اوکی می کنیم.
ابتدا یک نیم نگاهی به کلیت نتایج تست می اندازیم:
![image](https://github.com/hamidrezayaghobi/SEL_week7/assets/59170724/7debb42e-a4fc-458c-a75e-caa482327a75)
حال به ترتیب شروع می کنیم:
### FoodPassenger
برای متود گتر و ستر این کلاس تست می نویسم و پس از ران کردن تست مشاهده میکنم که کاورج آن ۱۰۰ شده است.
![image](https://github.com/hamidrezayaghobi/SEL_week7/assets/59170724/f92c6ac2-71c5-434b-9365-236bf05841fa)
![image](https://github.com/hamidrezayaghobi/SEL_week7/assets/59170724/03e0e54e-a1ae-4dd9-8aed-ba14e2b5d8a4)

### Person
بعد از بررسی، متوجه می شویم که تنها کافیست برای Age در این کلاس گتر ستر را تست کنیم و سپس مشاهده میکنم که درصد کاورج آن ۱۰۰ شده است.
![image](https://github.com/hamidrezayaghobi/SEL_week7/assets/59170724/435a9044-f071-48b4-9e27-fcaeeddde3c7)
![image](https://github.com/hamidrezayaghobi/SEL_week7/assets/59170724/c15bb220-4826-4332-871a-f34b474bf0e1)

### Traffic
طبق بخش های قبلی هم کافیست برای متدهای گتر ستر تست بنویسیم.

![Screenshot from 2024-01-13 18-52-34](https://github.com/hamidrezayaghobi/SEL_week7/assets/59170724/77801f3e-cbc9-4f79-8ac2-5c86a3295e87)
![Screenshot from 2024-01-13 18-52-45](https://github.com/hamidrezayaghobi/SEL_week7/assets/59170724/41c6c848-50df-4f1c-876c-565401ada0b0)

### PersonValidator
کافیه برای requiredName تست بنویسیم:
![image](https://github.com/hamidrezayaghobi/SEL_week7/assets/59170724/2d1a9cf0-4ee6-41f4-96b2-805939da5195)
![image](https://github.com/hamidrezayaghobi/SEL_week7/assets/59170724/147a0d6b-8636-43c5-8ad2-93482d2f7239)

