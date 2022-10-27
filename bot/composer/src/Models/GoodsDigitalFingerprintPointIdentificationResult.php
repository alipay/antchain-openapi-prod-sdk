<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class GoodsDigitalFingerprintPointIdentificationResult extends Model
{
    // 子鉴定项
    /**
     * @example 子鉴定项
     *
     * @var string
     */
    public $subPointName;

    // 商品数字指纹鉴定子项鉴定结果
    /**
     * @example REAL
     *
     * @var string
     */
    public $result;

    // 鉴定子项鉴定得分
    /**
     * @example 0.92
     *
     * @var string
     */
    public $grade;
    protected $_name = [
        'subPointName' => 'sub_point_name',
        'result'       => 'result',
        'grade'        => 'grade',
    ];

    public function validate()
    {
        Model::validateRequired('subPointName', $this->subPointName, true);
        Model::validateRequired('result', $this->result, true);
        Model::validateRequired('grade', $this->grade, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->subPointName) {
            $res['sub_point_name'] = $this->subPointName;
        }
        if (null !== $this->result) {
            $res['result'] = $this->result;
        }
        if (null !== $this->grade) {
            $res['grade'] = $this->grade;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GoodsDigitalFingerprintPointIdentificationResult
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['sub_point_name'])) {
            $model->subPointName = $map['sub_point_name'];
        }
        if (isset($map['result'])) {
            $model->result = $map['result'];
        }
        if (isset($map['grade'])) {
            $model->grade = $map['grade'];
        }

        return $model;
    }
}
