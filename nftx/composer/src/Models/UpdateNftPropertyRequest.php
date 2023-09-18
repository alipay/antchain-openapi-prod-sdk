<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\NFTX\Models;

use AlibabaCloud\Tea\Model;

class UpdateNftPropertyRequest extends Model
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

    // 用户id标识
    /**
     * @var string
     */
    public $idNo;

    // 用户id类型
    /**
     * @var string
     */
    public $idType;

    // 资产标识
    /**
     * @var string
     */
    public $nftId;

    // 更新的来源
    /**
     * @var string
     */
    public $source;

    // Json字符串：通过解析该字段，根据提前约定的key进行取值操作
    /**
     * @var string
     */
    public $updateInfo;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'idNo'              => 'id_no',
        'idType'            => 'id_type',
        'nftId'             => 'nft_id',
        'source'            => 'source',
        'updateInfo'        => 'update_info',
    ];

    public function validate()
    {
        Model::validateRequired('idNo', $this->idNo, true);
        Model::validateRequired('idType', $this->idType, true);
        Model::validateRequired('nftId', $this->nftId, true);
        Model::validateRequired('source', $this->source, true);
        Model::validateRequired('updateInfo', $this->updateInfo, true);
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
        if (null !== $this->idNo) {
            $res['id_no'] = $this->idNo;
        }
        if (null !== $this->idType) {
            $res['id_type'] = $this->idType;
        }
        if (null !== $this->nftId) {
            $res['nft_id'] = $this->nftId;
        }
        if (null !== $this->source) {
            $res['source'] = $this->source;
        }
        if (null !== $this->updateInfo) {
            $res['update_info'] = $this->updateInfo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateNftPropertyRequest
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
        if (isset($map['id_no'])) {
            $model->idNo = $map['id_no'];
        }
        if (isset($map['id_type'])) {
            $model->idType = $map['id_type'];
        }
        if (isset($map['nft_id'])) {
            $model->nftId = $map['nft_id'];
        }
        if (isset($map['source'])) {
            $model->source = $map['source'];
        }
        if (isset($map['update_info'])) {
            $model->updateInfo = $map['update_info'];
        }

        return $model;
    }
}
