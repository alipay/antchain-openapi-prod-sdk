<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class AddMydidcommunAssetDataRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 数据实际存储路径
    /**
     * @var string
     */
    public $dataPath;

    // 请求发起人的did
    /**
     * @var string
     */
    public $did;

    // 所注册的资产所有者DID，要注意资产所有者DID需与授权发起方DID相同
    /**
     * @var string
     */
    public $ownerDid;

    // 数据所对应的业务类型
    /**
     * @var string
     */
    public $serviceType;

    // 临时字段，数据文件的md5哈希值，在隐私服务无法直接读取数据时，由用户提供
    /**
     * @var string
     */
    public $dataHash;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'dataPath'          => 'data_path',
        'did'               => 'did',
        'ownerDid'          => 'owner_did',
        'serviceType'       => 'service_type',
        'dataHash'          => 'data_hash',
    ];

    public function validate()
    {
        Model::validateRequired('dataPath', $this->dataPath, true);
        Model::validateRequired('did', $this->did, true);
        Model::validateRequired('ownerDid', $this->ownerDid, true);
        Model::validateRequired('serviceType', $this->serviceType, true);
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
        if (null !== $this->dataPath) {
            $res['data_path'] = $this->dataPath;
        }
        if (null !== $this->did) {
            $res['did'] = $this->did;
        }
        if (null !== $this->ownerDid) {
            $res['owner_did'] = $this->ownerDid;
        }
        if (null !== $this->serviceType) {
            $res['service_type'] = $this->serviceType;
        }
        if (null !== $this->dataHash) {
            $res['data_hash'] = $this->dataHash;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AddMydidcommunAssetDataRequest
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
        if (isset($map['data_path'])) {
            $model->dataPath = $map['data_path'];
        }
        if (isset($map['did'])) {
            $model->did = $map['did'];
        }
        if (isset($map['owner_did'])) {
            $model->ownerDid = $map['owner_did'];
        }
        if (isset($map['service_type'])) {
            $model->serviceType = $map['service_type'];
        }
        if (isset($map['data_hash'])) {
            $model->dataHash = $map['data_hash'];
        }

        return $model;
    }
}
