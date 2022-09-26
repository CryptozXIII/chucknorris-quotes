<template>
  <div class="info-wrapper">
  <h1> vorname = Hoa </h1>
  <p>Nachname = Le</p>
  <h3>Nummer=68199</h3>
  </div>
</template>

<script>
export default {
  name: "AboutMeDetails.vue"
}
</script>

<style>
.info-wrapper {
  display: block;
  justify-content: space-evenly;
  align-items: center;
  height: 100%;
  width: 95%;
  margin: auto;
}
h1 {
  font-size: 5vw;
  text-align: center;
  font-style: italic;
  color: #42b983;
}
p {
  font-size: 4vw;
  text-align: center;
  font-style: oblique ;


}
h3 {
  font-size: 10vw;
  text-align: center;
  font-style: italic;

}

</style>
