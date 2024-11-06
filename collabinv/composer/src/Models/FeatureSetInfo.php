<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\COLLABINV\Models;

use AlibabaCloud\Tea\Model;

class FeatureSetInfo extends Model
{
    // 特征集编码
    /**
     * @example xxx
     *
     * @var string
     */
    public $featuresetCode;

    // 名称
    /**
     * @example 公共特征集
     *
     * @var string
     */
    public $featuresetName;

    // 数量
    /**
     * @example 2000
     *
     * @var string
     */
    public $nums;

    // 描述
    /**
     * @example 公共特征类
     *
     * @var string
     */
    public $desc;
    protected $_name = [
        'featuresetCode' => 'featureset_code',
        'featuresetName' => 'featureset_name',
        'nums'           => 'nums',
        'desc'           => 'desc',
    ];

    public function validate()
    {
        Model::validateRequired('featuresetCode', $this->featuresetCode, true);
        Model::validateRequired('featuresetName', $this->featuresetName, true);
        Model::validateRequired('nums', $this->nums, true);
        Model::validateRequired('desc', $this->desc, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->featuresetCode) {
            $res['featureset_code'] = $this->featuresetCode;
        }
        if (null !== $this->featuresetName) {
            $res['featureset_name'] = $this->featuresetName;
        }
        if (null !== $this->nums) {
            $res['nums'] = $this->nums;
        }
        if (null !== $this->desc) {
            $res['desc'] = $this->desc;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return FeatureSetInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['featureset_code'])) {
            $model->featuresetCode = $map['featureset_code'];
        }
        if (isset($map['featureset_name'])) {
            $model->featuresetName = $map['featureset_name'];
        }
        if (isset($map['nums'])) {
            $model->nums = $map['nums'];
        }
        if (isset($map['desc'])) {
            $model->desc = $map['desc'];
        }

        return $model;
    }
}
