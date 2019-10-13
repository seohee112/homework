# homework
##### 20160021 박서희
###### 깃허브 주소 https://github.com/seohee112/homework
###### 본인의 개발환경은 LG그램 윈도우10 64bit
###### java version "1.8.0_201"
###### AVD는 주로 Nexus 5X API 27를 사용했습니다.
#### 접속 페이지
###### RelativeLayout을 사용한 메인 화면에 회원 ID/비밀번호 입력칸과 로그인/회원가입 버튼을 만들었습니다.
###### ID, 비밀번호가 가입 정보와 다르면 "아이디 또는 비밀번호가 틀렸습니다"라는 오류 메시지를 출력합니다.
###### ID, 비밀번호 입력이 정상이면 세 번째 화면(계산기 페이지)로 넘어갑니다.
#### 회원가입 페이지
###### 화면이 작은 AVD를 사용하면 일부 내용이 가려지므로 ScrollView를 사용하고 그 안에 LinearLayout을 사용했습니다.
###### ID는 2자리 이상, 비밀번호는 5자리 이상 12자리 이하라는 자릿수 규칙을 적용했습니다.
###### ID와 비밀번호 둘 중 하나라도 규칙을 지키지 않으면 "조건을 맞춰주세요"라는 메시지를 출력합니다.
###### ID 중복검사 기능은 구현하지 못했습니다.
###### 이름/전화번호/주소 입력칸을 만들었고 필수 입력칸은 아닙니다.
###### 개인정보 사용 동의 약관을 만들었고 동의 여부는 RadioGroup의 버튼을 통해 표시합니다.
###### '저장하기' 버튼을 누르면 기입한 정보가 저장되고 '돌아가기' 버튼을 누르면 접속 페이지로 돌아갑니다.
###### DB를 사용한 경험이 없어 대신 SharedPreferences로 임시적인 회원 정보 저장 및 불러오기 기능을 구현했습니다.
#### 계산기 페이지
###### 회원가입 페이지에서 저장한 ID, 비밀번호를 접속 페이지에 기입하고 로그인 버튼을 누르면 계산기 페이지가 출력됩니다.
###### FrameLayout과 ImageView, Button을 사용해 단 한번 이미지를 변경하는 기능을 만들었습니다.
###### 계산기는 TableLayout을 사용해 만들었습니다.
###### 자연수 2개를 가지고 사칙연산이 가능한 기초적인 계산기 기능을 구현했습니다.
###### 숫자를 입력하고 사칙연산 버튼 하나를 누른 뒤 등호 버튼을 누르면 결과값이 나타납니다.
