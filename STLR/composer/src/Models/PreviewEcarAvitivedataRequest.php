<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\STLR\Models;

use AlibabaCloud\Tea\Model;

class PreviewEcarAvitivedataRequest extends Model
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

    // 请求统计的年份，默认为当前年份
    /**
     * @var int
     */
    public $year;

    // 统计比较运算是的基准：
    // LastYear(去年同期比较),
    // CriteriaYear(同基准年比较)。
    // 默认与去年同期比较。
    /**
     * @var string
     */
    public $comparisonStandard;
    protected $_name = [
        'authToken'          => 'auth_token',
        'productInstanceId'  => 'product_instance_id',
        'year'               => 'year',
        'comparisonStandard' => 'comparison_standard',
    ];

    public function validate()
    {
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
        if (null !== $this->year) {
            $res['year'] = $this->year;
        }
        if (null !== $this->comparisonStandard) {
            $res['comparison_standard'] = $this->comparisonStandard;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PreviewEcarAvitivedataRequest
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
        if (isset($map['year'])) {
            $model->year = $map['year'];
        }
        if (isset($map['comparison_standard'])) {
            $model->comparisonStandard = $map['comparison_standard'];
        }

        return $model;
    }
}
