
--- TỐNG KẾT VỀ GITHUB - CHƠI VỚI GITHUB CHO NGƯỜI MỚI BẮT ĐẦU
1. CẦN CÓ 1 ACCOUNT GITHUB (username/1 phần url; email; password)
2. TẢI GITHB TOOL VỀ MÁY https://git-scm.com/downloads
	- Khi install nhớ check vào 3 option (3 dấu tích)
	>>>>> Git Bash sẽ được ti1cch hợp vào chuột phải của Windows 
	- Chọn option chơi với main
3. TẠO SẴN 1 PROJECT trống trên kho GITHUB (gọi là remote)
	- Không tích chọn bất cứ thứ gì, chỉ nhập tên kho + public/private mà thôi
	- Tên kho remote trùng 100% tên project ở Local (kể cả hoa thường)
4. Tạo PROJECT ở Local (máy mình) (gọi là main)
	- Tên PROJECT này trùng 100% tên kho mình sẽ upload/ đồng bộ sau này
	- Chuẩn bị sẵn trong thư mục project ở Local 2 file đặc biệt
	
	.gitignore (chứa dòng text nói rằng thư mục nào, tập tin nào ở lại Local, không cho lên server
	tùy tool mình dùng. Vào gitignore.io để nhờ web app tạo giùm file, copy & paste vào notepad -> save
	- README.md (chứa các thẻ/tag dùng để tạo trang index.html cho mỗi kho thẻ này theo chuẩn Mark Down,
	là 1 dạng "html" siêu đơn giản - Google search "mark down là gì", cú pháp markdwn
5. Những lệnh chỉ dùng 1 lần duy nhất cho 1 máy, chỉ gõ lại nếu bạn thay đổi ACCOUNT GITHB, nếu bạn cài lại
Windows, nếu mượn máy bạn bè

git config --global user.name <tên user github của bạn>
git config --global user.mail <tên email Github của bạn>

LÁT HỒI KHI ĐỒNG BỘ CODE LÊN SERVER, SẼ BỊ HỎI PASS/ HỎI LOGIN, Windows SẼ REMEMBER ĐỂ KHÔNG CẦN GÕ LẠI PASS
>>>>>Nếu muốn remove account đã remembber, gõ trong ô search trong Windows
	credential > chọn Credentials Manager > tìm GITHB và remote
6. Những lệnh chỉ dùng 1 lần duy nhất cho 1 PROJECT
Mỗi PROJECT bạn tạo ra ở Local, muốn đưa lên server thì gõi lệnh này 1 lần (1 lần cho prroject)
git init

>>>>> khi gõ lệnh này xong thì trong thư mục PROJECT sẽ sinh ra 1 thư mục ẩn tên là .git; chứa nhật kí thay đổi 
của PROJECT ở Local ~ đồng bộ với server. Cấm tuyết đối xóa trong này!!!! Hoặc gitub mất dấu vế theo dõi lịch sử thay đổi project 

git add. (.nghĩa là sẽ đồng bộ thư mục, tập tin ko nằm trong .gitignore và đặc biệt là đưa luôn cả những tập tin mà không có dấu .
phía trước tên. lệnh git add * không đưa thằng có dấu . lệnh lên server) 

lí do dùng lệnh này lần đầu tiên: ta cần đưa chính file .gitignore đi lên server luôn
anh em trong team download source này về, source của anh em cũng cần có file .gitignore này; để sau này ae đồng bộ code ko đồng 
bộ thư mục rác lên server - Y chang mình - Chủ dự án

git commmit -m "nói-lí-do- thay-dổi-source-gì-ở-đây)

git branch -M main

git remote add origin https://tên-bạn/tên-kho-muốn-đông=bộ-code.git