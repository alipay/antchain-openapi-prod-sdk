<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\DD\Models;

use AlibabaCloud\Tea\Model;

class CountryCnEnItem extends Model {
    protected $_name = [
        'countryCode' => 'country_code',
        'countryCn' => 'country_cn',
        'countryEn' => 'country_en',
    ];
    public function validate() {
        Model::validateRequired('countryCode', $this->countryCode, true);
        Model::validateRequired('countryCn', $this->countryCn, true);
        Model::validateRequired('countryEn', $this->countryEn, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->countryCode) {
            $res['country_code'] = $this->countryCode;
        }
        if (null !== $this->countryCn) {
            $res['country_cn'] = $this->countryCn;
        }
        if (null !== $this->countryEn) {
            $res['country_en'] = $this->countryEn;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return CountryCnEnItem
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['country_code'])){
            $model->countryCode = $map['country_code'];
        }
        if(isset($map['country_cn'])){
            $model->countryCn = $map['country_cn'];
        }
        if(isset($map['country_en'])){
            $model->countryEn = $map['country_en'];
        }
        return $model;
    }
    // 国家字母编号
    /**
     * @example CN
     * @var string
     */
    public $countryCode;

    // 国家中文名称
    /**
     * @example 中国
     * @var string
     */
    public $countryCn;

    // 国家英文名称
    /**
     * @example China
     * @var string
     */
    public $countryEn;

}
