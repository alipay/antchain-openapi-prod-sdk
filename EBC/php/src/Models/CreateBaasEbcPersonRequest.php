<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\EBC\Models;

use AlibabaCloud\Tea\Model;

use AntChain\EBC\Models\PrivacyDesc;
use AntChain\EBC\Models\ProxyDesc;
use AntChain\EBC\Models\PublicDesc;

class CreateBaasEbcPersonRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'regionName' => 'region_name',
        'personName' => 'person_name',
        'primaryIdNo' => 'primary_id_no',
        'privacyDescList' => 'privacy_desc_list',
        'proxyDescList' => 'proxy_desc_list',
        'publicDescList' => 'public_desc_list',
        'secondIdNo1' => 'second_id_no_1',
        'secondIdNo2' => 'second_id_no_2',
        'secondIdNo3' => 'second_id_no_3',
        'secretKey' => 'secret_key',
    ];
    public function validate() {
        Model::validateMaxLength('personName', $this->personName, 32);
        Model::validateMaxLength('primaryIdNo', $this->primaryIdNo, 1024);
        Model::validateMaxLength('secondIdNo1', $this->secondIdNo1, 1024);
        Model::validateMaxLength('secondIdNo2', $this->secondIdNo2, 1024);
        Model::validateMaxLength('secondIdNo3', $this->secondIdNo3, 1024);
        Model::validateMaxLength('secretKey', $this->secretKey, 512);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->regionName) {
            $res['region_name'] = $this->regionName;
        }
        if (null !== $this->personName) {
            $res['person_name'] = $this->personName;
        }
        if (null !== $this->primaryIdNo) {
            $res['primary_id_no'] = $this->primaryIdNo;
        }
        if (null !== $this->privacyDescList) {
            $res['privacy_desc_list'] = [];
            if(null !== $this->privacyDescList && is_array($this->privacyDescList)){
                $n = 0;
                foreach($this->privacyDescList as $item){
                    $res['privacy_desc_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->proxyDescList) {
            $res['proxy_desc_list'] = [];
            if(null !== $this->proxyDescList && is_array($this->proxyDescList)){
                $n = 0;
                foreach($this->proxyDescList as $item){
                    $res['proxy_desc_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->publicDescList) {
            $res['public_desc_list'] = [];
            if(null !== $this->publicDescList && is_array($this->publicDescList)){
                $n = 0;
                foreach($this->publicDescList as $item){
                    $res['public_desc_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->secondIdNo1) {
            $res['second_id_no_1'] = $this->secondIdNo1;
        }
        if (null !== $this->secondIdNo2) {
            $res['second_id_no_2'] = $this->secondIdNo2;
        }
        if (null !== $this->secondIdNo3) {
            $res['second_id_no_3'] = $this->secondIdNo3;
        }
        if (null !== $this->secretKey) {
            $res['secret_key'] = $this->secretKey;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return CreateBaasEbcPersonRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['region_name'])){
            $model->regionName = $map['region_name'];
        }
        if(isset($map['person_name'])){
            $model->personName = $map['person_name'];
        }
        if(isset($map['primary_id_no'])){
            $model->primaryIdNo = $map['primary_id_no'];
        }
        if(isset($map['privacy_desc_list'])){
            if(!empty($map['privacy_desc_list'])){
                $model->privacyDescList = [];
                $n = 0;
                foreach($map['privacy_desc_list'] as $item) {
                    $model->privacyDescList[$n++] = null !== $item ? PrivacyDesc::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['proxy_desc_list'])){
            if(!empty($map['proxy_desc_list'])){
                $model->proxyDescList = [];
                $n = 0;
                foreach($map['proxy_desc_list'] as $item) {
                    $model->proxyDescList[$n++] = null !== $item ? ProxyDesc::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['public_desc_list'])){
            if(!empty($map['public_desc_list'])){
                $model->publicDescList = [];
                $n = 0;
                foreach($map['public_desc_list'] as $item) {
                    $model->publicDescList[$n++] = null !== $item ? PublicDesc::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['second_id_no_1'])){
            $model->secondIdNo1 = $map['second_id_no_1'];
        }
        if(isset($map['second_id_no_2'])){
            $model->secondIdNo2 = $map['second_id_no_2'];
        }
        if(isset($map['second_id_no_3'])){
            $model->secondIdNo3 = $map['second_id_no_3'];
        }
        if(isset($map['secret_key'])){
            $model->secretKey = $map['secret_key'];
        }
        return $model;
    }
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    /**
     * @var string
     */
    public $regionName;

    // 姓名
    /**
     * @var string
     */
    public $personName;

    // 持有人主证件编号，无身份证的个人使用0000000000000000
    // 请使用我们提供的公钥对数据进行加密
    /**
     * @var string
     */
    public $primaryIdNo;

    // 隐私属性描述列表
    // 
    /**
     * @var array
     */
    public $privacyDescList;

    // 托管属性描述列表
    // 
    /**
     * @var array
     */
    public $proxyDescList;

    // 公开属性描述列表
    // 
    /**
     * @var array
     */
    public $publicDescList;

    // 持有人辅助证件编号-1
    // 请使用我们提供的公钥对数据进行加密
    /**
     * @var string
     */
    public $secondIdNo1;

    // 持有人辅助证件编号-1
    // 请使用我们提供的公钥对数据进行加密
    /**
     * @var string
     */
    public $secondIdNo2;

    // 持有人辅助证件编号-3
    // 请使用我们提供的公钥对数据进行加密
    /**
     * @var string
     */
    public $secondIdNo3;

    // 非对称加密后的对称秘钥，对应执行java SDK中的EnvelopeClient#envelopeSeal方法的返回值
    /**
     * @var string
     */
    public $secretKey;

}
