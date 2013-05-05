<div class="well" style="max-width: 400px; margin: 0 auto 10px;">
	<form id="file-input-form" action="/pictureupload" enctype="multipart/form-data" method="post">
		<input id="file-input" type="file" name="datafile" size="40" style="display:none">
	    <button id="upload-button" type="button" class="btn btn-large btn-block btn-success">Upload</button>
	</form>
</div>

<script type="text/javascript">
	$(document).ready(function() {
		$("#upload-button").click(function() {
			$("#file-input").click()
		})
		$("#file-input").change(function() {
			$("#file-input-form").submit()		
		})
	})
</script>
