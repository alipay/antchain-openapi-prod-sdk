<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class ContractSignFieldSealId extends Model
{
    // 文件file id
    /**
     * @example 0178c086a740475caf516f37901352b3
     *
     * @var string
     */
    public $fileId;

    // 流程id
    /**
     * @example 1b6b68e44d834f5982cf1959fd9782c3
     *
     * @var string
     */
    public $flowId;

    // 印章id
    /**
     * @example 8a8b26de-b15e-4791-ae89-e75d928155cc
     *
     * @var string
     */
    public $sealId;

    // 印章类型，支持多种类型时逗号分割，0-手绘印章，1-模版印章，为空不限制
    /**
     * @example 0
     *
     * @var string
     */
    public $sealType;

    // 签署区Id
    /**
     * @example 52adb35497b141e3893912b3a2ea4f42
     *
     * @var string
     */
    public $signfieldId;
    protected $_name = [
        'fileId'      => 'file_id',
        'flowId'      => 'flow_id',
        'sealId'      => 'seal_id',
        'sealType'    => 'seal_type',
        'signfieldId' => 'signfield_id',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->fileId) {
            $res['file_id'] = $this->fileId;
        }
        if (null !== $this->flowId) {
            $res['flow_id'] = $this->flowId;
        }
        if (null !== $this->sealId) {
            $res['seal_id'] = $this->sealId;
        }
        if (null !== $this->sealType) {
            $res['seal_type'] = $this->sealType;
        }
        if (null !== $this->signfieldId) {
            $res['signfield_id'] = $this->signfieldId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ContractSignFieldSealId
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['file_id'])) {
            $model->fileId = $map['file_id'];
        }
        if (isset($map['flow_id'])) {
            $model->flowId = $map['flow_id'];
        }
        if (isset($map['seal_id'])) {
            $model->sealId = $map['seal_id'];
        }
        if (isset($map['seal_type'])) {
            $model->sealType = $map['seal_type'];
        }
        if (isset($map['signfield_id'])) {
            $model->signfieldId = $map['signfield_id'];
        }

        return $model;
    }
}
