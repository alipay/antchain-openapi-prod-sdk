<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\INSURANCE_SAAS\Models;

use AlibabaCloud\Tea\Model;

class ConversionDataDTO extends Model {
    protected $_name = [
        'conversionType' => 'conversion_type',
        'conversionCount' => 'conversion_count',
    ];
    public function validate() {
        Model::validateRequired('conversionType', $this->conversionType, true);
        Model::validateRequired('conversionCount', $this->conversionCount, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->conversionType) {
            $res['conversion_type'] = $this->conversionType;
        }
        if (null !== $this->conversionCount) {
            $res['conversion_count'] = $this->conversionCount;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ConversionDataDTO
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['conversion_type'])){
            $model->conversionType = $map['conversion_type'];
        }
        if(isset($map['conversion_count'])){
            $model->conversionCount = $map['conversion_count'];
        }
        return $model;
    }
    // 转化目标类型
    /**
     * @example FORMBOOK
     * @var string
     */
    public $conversionType;

    // 目标转化量
    /**
     * @example 100
     * @var int
     */
    public $conversionCount;

}
