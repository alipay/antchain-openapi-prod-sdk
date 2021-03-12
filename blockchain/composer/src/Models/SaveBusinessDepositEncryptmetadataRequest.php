<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class SaveBusinessDepositEncryptmetadataRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 集群ID
    /**
     * @var string
     */
    public $productInstanceId;

    // 业务链对应的bizId
    //
    /**
     * @var string
     */
    public $bizId;

    // 要加密的数据
    /**
     * @var string
     */
    public $data;

    // 用户的did身份地址
    /**
     * @var string
     */
    public $did;

    // 业务唯一id，只需要本链本用户所用的业务keyId唯一即可
    /**
     * @var string
     */
    public $keyId;

    // 存证内容描述，格式为json，其中type为支持的类型：
    // text：文本类型
    // image：图片类型(待添加)
    // video：视频类型(待添加)
    // txHash：存证引用类型(待添加)
    // map:地图类型(待添加)
    /**
     * @var string
     */
    public $metadata;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'bizId'             => 'biz_id',
        'data'              => 'data',
        'did'               => 'did',
        'keyId'             => 'key_id',
        'metadata'          => 'metadata',
    ];

    public function validate()
    {
        Model::validateRequired('bizId', $this->bizId, true);
        Model::validateRequired('data', $this->data, true);
        Model::validateRequired('did', $this->did, true);
        Model::validateRequired('metadata', $this->metadata, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->bizId) {
            $res['biz_id'] = $this->bizId;
        }
        if (null !== $this->data) {
            $res['data'] = $this->data;
        }
        if (null !== $this->did) {
            $res['did'] = $this->did;
        }
        if (null !== $this->keyId) {
            $res['key_id'] = $this->keyId;
        }
        if (null !== $this->metadata) {
            $res['metadata'] = $this->metadata;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SaveBusinessDepositEncryptmetadataRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['biz_id'])) {
            $model->bizId = $map['biz_id'];
        }
        if (isset($map['data'])) {
            $model->data = $map['data'];
        }
        if (isset($map['did'])) {
            $model->did = $map['did'];
        }
        if (isset($map['key_id'])) {
            $model->keyId = $map['key_id'];
        }
        if (isset($map['metadata'])) {
            $model->metadata = $map['metadata'];
        }

        return $model;
    }
}
