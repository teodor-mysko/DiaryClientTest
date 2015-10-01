<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
 <tiles:insertDefinition name="defaultTemplate"> 
	<tiles:putAttribute name="body">



		<div class="body">
			<div id="map"></div>
			<script type="text/javascript">
			var map = new google.maps.Map(document.getElementById('map'), {
			    center: {lat: -34.397, lng: 150.644},
			    scrollwheel: false,
			    zoom: 8
					});
				
			</script>
			<script async defer
				src="https://maps.googleapis.com/maps/api/js?key=AIzaSyDVNKV9iZ-DpOUIJ49mmpXQsoYmNzQptdg&callback=initMap">
				
			</script>
		</div>



	</tiles:putAttribute>
</tiles:insertDefinition>