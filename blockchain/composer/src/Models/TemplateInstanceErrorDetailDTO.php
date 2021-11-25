<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class TemplateInstanceErrorDetailDTO extends Model
{
    // 当前错误类型的错误行数
    /**
     * @example 1-5000
     *
     * @var int
     */
    public $errorNum;

    // 出错数据抽样
    /**
     * @example [“xxx“, “xxxx“]
     *
     * @var string[]
     */
    public $samples;

    // 出错列，从0开始
    /**
     * @example 0
     *
     * @var int
     */
    public $errorColumnIndex;

    // 当前错误类型的描述
    /**
     * @example 身份证号格式不正确
     *
     * @var string
     */
    public $errorDescription;
    protected $_name = [
        'errorNum'         => 'error_num',
        'samples'          => 'samples',
        'errorColumnIndex' => 'error_column_index',
        'errorDescription' => 'error_description',
    ];

    public function validate()
    {
        Model::validateRequired('errorNum', $this->errorNum, true);
        Model::validateRequired('samples', $this->samples, true);
        Model::validateRequired('errorColumnIndex', $this->errorColumnIndex, true);
        Model::validateRequired('errorDescription', $this->errorDescription, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->errorNum) {
            $res['error_num'] = $this->errorNum;
        }
        if (null !== $this->samples) {
            $res['samples'] = $this->samples;
        }
        if (null !== $this->errorColumnIndex) {
            $res['error_column_index'] = $this->errorColumnIndex;
        }
        if (null !== $this->errorDescription) {
            $res['error_description'] = $this->errorDescription;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return TemplateInstanceErrorDetailDTO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['error_num'])) {
            $model->errorNum = $map['error_num'];
        }
        if (isset($map['samples'])) {
            if (!empty($map['samples'])) {
                $model->samples = $map['samples'];
            }
        }
        if (isset($map['error_column_index'])) {
            $model->errorColumnIndex = $map['error_column_index'];
        }
        if (isset($map['error_description'])) {
            $model->errorDescription = $map['error_description'];
        }

        return $model;
    }
}
