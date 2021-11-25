<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ACC\Models;

use AlibabaCloud\Tea\Model;

class Construction extends Model
{
    // 证书编号
    //
    //
    /**
     * @example 证书编号
     *
     * @var string
     */
    public $certNum;

    // 发证机关
    //
    //
    /**
     * @example 发证机关
     *
     * @var string
     */
    public $issuingAuthority;

    // 资质类别
    /**
     * @example 资质类别
     *
     * @var string
     */
    public $certType;

    // 等级
    /**
     * @example 等级
     *
     * @var string
     */
    public $level;

    // 有效期开始日期（yyyy-MM-dd）
    //
    //
    /**
     * @example 有效期开始日期（yyyy-MM-dd）
     *
     * @var string
     */
    public $effectStartDate;

    // 有效期结束日期（yyyy-MM-dd）
    //
    //
    /**
     * @example 有效期结束日期（yyyy-MM-dd）
     *
     * @var string
     */
    public $effectEndDate;

    // 文件
    /**
     * @example
     *
     * @var FileDefine[]
     */
    public $fileDefines;

    // key
    /**
     * @example key
     *
     * @var string
     */
    public $constructionId;

    // 证件名称
    /**
     * @example 证件名称
     *
     * @var string
     */
    public $certName;
    protected $_name = [
        'certNum'          => 'cert_num',
        'issuingAuthority' => 'issuing_authority',
        'certType'         => 'cert_type',
        'level'            => 'level',
        'effectStartDate'  => 'effect_start_date',
        'effectEndDate'    => 'effect_end_date',
        'fileDefines'      => 'file_defines',
        'constructionId'   => 'construction_id',
        'certName'         => 'cert_name',
    ];

    public function validate()
    {
        Model::validateRequired('certNum', $this->certNum, true);
        Model::validateRequired('issuingAuthority', $this->issuingAuthority, true);
        Model::validateRequired('certType', $this->certType, true);
        Model::validateRequired('level', $this->level, true);
        Model::validateRequired('effectStartDate', $this->effectStartDate, true);
        Model::validateRequired('effectEndDate', $this->effectEndDate, true);
        Model::validateRequired('constructionId', $this->constructionId, true);
        Model::validateRequired('certName', $this->certName, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->certNum) {
            $res['cert_num'] = $this->certNum;
        }
        if (null !== $this->issuingAuthority) {
            $res['issuing_authority'] = $this->issuingAuthority;
        }
        if (null !== $this->certType) {
            $res['cert_type'] = $this->certType;
        }
        if (null !== $this->level) {
            $res['level'] = $this->level;
        }
        if (null !== $this->effectStartDate) {
            $res['effect_start_date'] = $this->effectStartDate;
        }
        if (null !== $this->effectEndDate) {
            $res['effect_end_date'] = $this->effectEndDate;
        }
        if (null !== $this->fileDefines) {
            $res['file_defines'] = [];
            if (null !== $this->fileDefines && \is_array($this->fileDefines)) {
                $n = 0;
                foreach ($this->fileDefines as $item) {
                    $res['file_defines'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->constructionId) {
            $res['construction_id'] = $this->constructionId;
        }
        if (null !== $this->certName) {
            $res['cert_name'] = $this->certName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Construction
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['cert_num'])) {
            $model->certNum = $map['cert_num'];
        }
        if (isset($map['issuing_authority'])) {
            $model->issuingAuthority = $map['issuing_authority'];
        }
        if (isset($map['cert_type'])) {
            $model->certType = $map['cert_type'];
        }
        if (isset($map['level'])) {
            $model->level = $map['level'];
        }
        if (isset($map['effect_start_date'])) {
            $model->effectStartDate = $map['effect_start_date'];
        }
        if (isset($map['effect_end_date'])) {
            $model->effectEndDate = $map['effect_end_date'];
        }
        if (isset($map['file_defines'])) {
            if (!empty($map['file_defines'])) {
                $model->fileDefines = [];
                $n                  = 0;
                foreach ($map['file_defines'] as $item) {
                    $model->fileDefines[$n++] = null !== $item ? FileDefine::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['construction_id'])) {
            $model->constructionId = $map['construction_id'];
        }
        if (isset($map['cert_name'])) {
            $model->certName = $map['cert_name'];
        }

        return $model;
    }
}
