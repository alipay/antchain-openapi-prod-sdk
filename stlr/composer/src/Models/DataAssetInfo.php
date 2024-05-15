<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\STLR\Models;

use AlibabaCloud\Tea\Model;

class DataAssetInfo extends Model
{
    // 数据资产DID
    /**
     * @example 111
     *
     * @var string
     */
    public $datasetDid;

    // 数据资产所有方DID
    /**
     * @example 111
     *
     * @var string
     */
    public $userDid;

    // 数据资产名称
    /**
     * @example 企业固定化石燃料排放
     *
     * @var string
     */
    public $datasetName;

    // 数据类型
    /**
     * @example PERSONAL_GREEN_DATA_METRO
     *
     * @var string
     */
    public $dataType;
    protected $_name = [
        'datasetDid'  => 'dataset_did',
        'userDid'     => 'user_did',
        'datasetName' => 'dataset_name',
        'dataType'    => 'data_type',
    ];

    public function validate()
    {
        Model::validateRequired('datasetDid', $this->datasetDid, true);
        Model::validateRequired('userDid', $this->userDid, true);
        Model::validateRequired('datasetName', $this->datasetName, true);
        Model::validateRequired('dataType', $this->dataType, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->datasetDid) {
            $res['dataset_did'] = $this->datasetDid;
        }
        if (null !== $this->userDid) {
            $res['user_did'] = $this->userDid;
        }
        if (null !== $this->datasetName) {
            $res['dataset_name'] = $this->datasetName;
        }
        if (null !== $this->dataType) {
            $res['data_type'] = $this->dataType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DataAssetInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['dataset_did'])) {
            $model->datasetDid = $map['dataset_did'];
        }
        if (isset($map['user_did'])) {
            $model->userDid = $map['user_did'];
        }
        if (isset($map['dataset_name'])) {
            $model->datasetName = $map['dataset_name'];
        }
        if (isset($map['data_type'])) {
            $model->dataType = $map['data_type'];
        }

        return $model;
    }
}
