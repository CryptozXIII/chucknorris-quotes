
import { shallowMount } from '@vue/test-utils';
import ChuckNorrisQuote from "@/components/ChuckNorrisQuote";

describe('ChuckNorrisQuote.vue', () => {
    it('renders component', () => {
        const msg = 'Chuck Norris';
        const wrapper = shallowMount(ChuckNorrisQuote);
        expect(wrapper.text()).toContain(msg);
    });
});

