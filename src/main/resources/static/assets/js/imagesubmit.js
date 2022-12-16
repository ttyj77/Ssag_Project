let submit = document.getElementById("submitButton")
submit.onclick = showImage //Submit 버튼 클릭시 이미지 보여주기

function showImage() {
  let newImage = document.getElementById("image-show").lastElementChild

  // 이미지가 화면에 나타나고
  newImage.style.visibility = "visible"

  // 이미지 업로드 버튼은 숨겨진다
  document.getElementById("image-upload").style.visibility = "hidden"

  document.getElementById("fileName").textContent = null //기존 파일 이름 지우기
}

function loadFile(input) {
  let file = input.files[0] // 선택된 파일 가져오기

  // 미리 만들어 놓은 div에 text(파일 이름) 추가
  let name = document.getElementById("fileName")
  name.textContent = file.name

  // 새로운 이미지 div 추가
  let newImage = document.createElement("img")
  newImage.setAttribute("class", "img")

  // 이미지 source 가져오기
  newImage.src = URL.createObjectURL(file)

  newImage.style.width = "70%"
  newImage.style.height = "70%"
  newImage.style.visibility = "hidden" //버튼을 누르기 전까지는 이미지 숨기기
  newImage.style.objectFit = "contain"

  // 이미지를 image-show div에 추가
  let container = document.getElementById("image-show")
  container.appendChild(newImage)
}
