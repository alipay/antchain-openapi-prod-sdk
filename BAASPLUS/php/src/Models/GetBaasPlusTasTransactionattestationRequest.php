<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BAASPLUS\Models;

use AlibabaCloud\Tea\Model;

class GetBaasPlusTasTransactionattestationRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'regionName' => 'region_name',
        'algorithm' => 'algorithm',
        'certReq' => 'cert_req',
        'compress' => 'compress',
        'desc' => 'desc',
        'rid' => 'rid',
        'transId' => 'trans_id',
    ];
    public function validate() {}
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
        if (null !== $this->algorithm) {
            $res['algorithm'] = $this->algorithm;
        }
        if (null !== $this->certReq) {
            $res['cert_req'] = $this->certReq;
        }
        if (null !== $this->compress) {
            $res['compress'] = $this->compress;
        }
        if (null !== $this->desc) {
            $res['desc'] = $this->desc;
        }
        if (null !== $this->rid) {
            $res['rid'] = $this->rid;
        }
        if (null !== $this->transId) {
            $res['trans_id'] = $this->transId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return GetBaasPlusTasTransactionattestationRequest
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
        if(isset($map['algorithm'])){
            $model->algorithm = $map['algorithm'];
        }
        if(isset($map['cert_req'])){
            $model->certReq = $map['cert_req'];
        }
        if(isset($map['compress'])){
            $model->compress = $map['compress'];
        }
        if(isset($map['desc'])){
            $model->desc = $map['desc'];
        }
        if(isset($map['rid'])){
            $model->rid = $map['rid'];
        }
        if(isset($map['trans_id'])){
            $model->transId = $map['trans_id'];
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

    // 摘要算法默认，（sha256或者sm3 默认sm3）
    /**
     * @var string
     */
    public $algorithm;

    // tsr中是否保存证书，true表示保存，false表示不保存（默认为false）
    /**
     * @var bool
     */
    public $certReq;

    // 返回tsr是否压缩精简，true表示要压缩精简，false表示不压缩精简 （默认为true）
    /**
     * @var bool
     */
    public $compress;

    // 对事务的描述，长度小于20位
    /**
     * @var string
     */
    public $desc;

    // 事物hash(支持sha256或sm3摘要算法)
    // 长度64个字符。
    /**
     * @var string
     */
    public $rid;

    // 事务id，允许大小写数字且小于十位的字符串
    /**
     * @var string
     */
    public $transId;

}
