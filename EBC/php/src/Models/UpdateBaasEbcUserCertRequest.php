<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\EBC\Models;

use AlibabaCloud\Tea\Model;

use AntChain\EBC\Models\PrivacyDesc;
use AntChain\EBC\Models\ProxyDesc;
use AntChain\EBC\Models\PublicDesc;

class UpdateBaasEbcUserCertRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'regionName' => 'region_name',
        'certId' => 'cert_id',
        'certPublishTime' => 'cert_publish_time',
        'certStatus' => 'cert_status',
        'orgDid' => 'org_did',
        'orgUserId' => 'org_user_id',
        'privacyDescList' => 'privacy_desc_list',
        'proxyDescList' => 'proxy_desc_list',
        'publicDescList' => 'public_desc_list',
        'secretKey' => 'secret_key',
    ];
    public function validate() {
        Model::validateMaxLength('certId', $this->certId, 128);
        Model::validateMaxLength('orgDid', $this->orgDid, 128);
        Model::validateMaxLength('orgUserId', $this->orgUserId, 128);
        Model::validateMaxLength('secretKey', $this->secretKey, 512);
        Model::validatePattern('certPublishTime', $this->certPublishTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
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
        if (null !== $this->certId) {
            $res['cert_id'] = $this->certId;
        }
        if (null !== $this->certPublishTime) {
            $res['cert_publish_time'] = $this->certPublishTime;
        }
        if (null !== $this->certStatus) {
            $res['cert_status'] = $this->certStatus;
        }
        if (null !== $this->orgDid) {
            $res['org_did'] = $this->orgDid;
        }
        if (null !== $this->orgUserId) {
            $res['org_user_id'] = $this->orgUserId;
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
        if (null !== $this->secretKey) {
            $res['secret_key'] = $this->secretKey;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return UpdateBaasEbcUserCertRequest
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
        if(isset($map['cert_id'])){
            $model->certId = $map['cert_id'];
        }
        if(isset($map['cert_publish_time'])){
            $model->certPublishTime = $map['cert_publish_time'];
        }
        if(isset($map['cert_status'])){
            $model->certStatus = $map['cert_status'];
        }
        if(isset($map['org_did'])){
            $model->orgDid = $map['org_did'];
        }
        if(isset($map['org_user_id'])){
            $model->orgUserId = $map['org_user_id'];
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

    // 证书id
    /**
     * @var string
     */
    public $certId;

    // 首次发布时间
    /**
     * @var string
     */
    public $certPublishTime;

    // 1-有效 2-冻结 3-失效 4-作废 5-其他
    /**
     * @var int
     */
    public $certStatus;

    // 企业did
    /**
     * @var string
     */
    public $orgDid;

    // 企业用户id
    /**
     * @var string
     */
    public $orgUserId;

    // 隐私属性描述列表
    // 
    /**
     * @var PrivacyDesc[]
     */
    public $privacyDescList;

    // 托管属性描述列表
    // 
    /**
     * @var ProxyDesc[]
     */
    public $proxyDescList;

    // 公开属性描述列表
    // 
    /**
     * @var PublicDesc[]
     */
    public $publicDescList;

    // 非对称加密后的对称秘钥，对应执行java SDK中的EnvelopeClient#envelopeSeal方法的返回值
    /**
     * @var string
     */
    public $secretKey;

}
