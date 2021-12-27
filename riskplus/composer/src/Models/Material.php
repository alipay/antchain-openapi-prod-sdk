<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class Material extends Model
{
    // 资料类型0-风控报告1-合同2-图片3-附件
    /**
     * @example 0
     *
     * @var string
     */
    public $mType;

    // 大类编码00-风控报告10-合同20身份证图片26人脸图片30-附件
    /**
     * @example 00
     *
     * @var string
     */
    public $bigCode;

    // 小类编码
    // 201-身份证人脸面202身份证国徽面212-活体人脸图片
    /**
     * @example 201
     *
     * @var string
     */
    public $smallCode;

    // 资料名称
    /**
     * @example 资料名称
     *
     * @var string
     */
    public $meterialName;

    // 文件地址
    /**
     * @example 文件地址
     *
     * @var string
     */
    public $filePath;
    protected $_name = [
        'mType'        => 'm_type',
        'bigCode'      => 'big_code',
        'smallCode'    => 'small_code',
        'meterialName' => 'meterial_name',
        'filePath'     => 'file_path',
    ];

    public function validate()
    {
        Model::validateRequired('mType', $this->mType, true);
        Model::validateRequired('bigCode', $this->bigCode, true);
        Model::validateRequired('smallCode', $this->smallCode, true);
        Model::validateRequired('meterialName', $this->meterialName, true);
        Model::validateRequired('filePath', $this->filePath, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->mType) {
            $res['m_type'] = $this->mType;
        }
        if (null !== $this->bigCode) {
            $res['big_code'] = $this->bigCode;
        }
        if (null !== $this->smallCode) {
            $res['small_code'] = $this->smallCode;
        }
        if (null !== $this->meterialName) {
            $res['meterial_name'] = $this->meterialName;
        }
        if (null !== $this->filePath) {
            $res['file_path'] = $this->filePath;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Material
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['m_type'])) {
            $model->mType = $map['m_type'];
        }
        if (isset($map['big_code'])) {
            $model->bigCode = $map['big_code'];
        }
        if (isset($map['small_code'])) {
            $model->smallCode = $map['small_code'];
        }
        if (isset($map['meterial_name'])) {
            $model->meterialName = $map['meterial_name'];
        }
        if (isset($map['file_path'])) {
            $model->filePath = $map['file_path'];
        }

        return $model;
    }
}
