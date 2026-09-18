<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\SECURITYTECH\Models;

use AlibabaCloud\Tea\Model;

class MaoImages extends Model {
    protected $_name = [
        'businessLicense' => 'business_license',
        'storefront' => 'storefront',
        'environment' => 'environment',
        'frontDesk' => 'front_desk',
        'idCardFront' => 'id_card_front',
        'idCardBack' => 'id_card_back',
    ];
    public function validate() {
        Model::validateRequired('businessLicense', $this->businessLicense, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->businessLicense) {
            $res['business_license'] = $this->businessLicense;
        }
        if (null !== $this->storefront) {
            $res['storefront'] = $this->storefront;
        }
        if (null !== $this->environment) {
            $res['environment'] = $this->environment;
        }
        if (null !== $this->frontDesk) {
            $res['front_desk'] = $this->frontDesk;
        }
        if (null !== $this->idCardFront) {
            $res['id_card_front'] = $this->idCardFront;
        }
        if (null !== $this->idCardBack) {
            $res['id_card_back'] = $this->idCardBack;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return MaoImages
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['business_license'])){
            $model->businessLicense = $map['business_license'];
        }
        if(isset($map['storefront'])){
            $model->storefront = $map['storefront'];
        }
        if(isset($map['environment'])){
            $model->environment = $map['environment'];
        }
        if(isset($map['front_desk'])){
            $model->frontDesk = $map['front_desk'];
        }
        if(isset($map['id_card_front'])){
            $model->idCardFront = $map['id_card_front'];
        }
        if(isset($map['id_card_back'])){
            $model->idCardBack = $map['id_card_back'];
        }
        return $model;
    }
    // 营业执照
    /**
     * @example 营业执照
     * @var string
     */
    public $businessLicense;

    // 门头照
    /**
     * @example 门头照
     * @var string
     */
    public $storefront;

    // 环境照
    /**
     * @example 环境照
     * @var string
     */
    public $environment;

    // 前台照
    /**
     * @example 前台照
     * @var string
     */
    public $frontDesk;

    // 法人身份证人像面
    /**
     * @example 法人身份证人像面
     * @var string
     */
    public $idCardFront;

    // 法人身份证国徽面
    /**
     * @example 法人身份证国徽面
     * @var string
     */
    public $idCardBack;

}
