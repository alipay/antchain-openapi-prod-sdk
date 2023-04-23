<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\PARTNER\Models;

use AlibabaCloud\Tea\Model;

class SignRecord extends Model
{
    // 合同类型：标准、自定义
    /**
     * @example Standard（标准）、Custom（自定义）
     *
     * @var string
     */
    public $contractType;

    // 签约模式：ENTITY_SEAL（实体章）、ELECTRONIC_SEAL（电子章）
    /**
     * @example ENTITY_SEAL
     *
     * @var string
     */
    public $sealMode;

    // 签约状态
    /**
     * @example INIT
     *
     * @var string
     */
    public $signStatus;

    // 签约记录关联的文件信息
    /**
     * @example
     *
     * @var PartnerSignFile[]
     */
    public $files;
    protected $_name = [
        'contractType' => 'contract_type',
        'sealMode'     => 'seal_mode',
        'signStatus'   => 'sign_status',
        'files'        => 'files',
    ];

    public function validate()
    {
        Model::validateRequired('contractType', $this->contractType, true);
        Model::validateRequired('sealMode', $this->sealMode, true);
        Model::validateRequired('signStatus', $this->signStatus, true);
        Model::validateRequired('files', $this->files, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->contractType) {
            $res['contract_type'] = $this->contractType;
        }
        if (null !== $this->sealMode) {
            $res['seal_mode'] = $this->sealMode;
        }
        if (null !== $this->signStatus) {
            $res['sign_status'] = $this->signStatus;
        }
        if (null !== $this->files) {
            $res['files'] = [];
            if (null !== $this->files && \is_array($this->files)) {
                $n = 0;
                foreach ($this->files as $item) {
                    $res['files'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SignRecord
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['contract_type'])) {
            $model->contractType = $map['contract_type'];
        }
        if (isset($map['seal_mode'])) {
            $model->sealMode = $map['seal_mode'];
        }
        if (isset($map['sign_status'])) {
            $model->signStatus = $map['sign_status'];
        }
        if (isset($map['files'])) {
            if (!empty($map['files'])) {
                $model->files = [];
                $n            = 0;
                foreach ($map['files'] as $item) {
                    $model->files[$n++] = null !== $item ? PartnerSignFile::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
