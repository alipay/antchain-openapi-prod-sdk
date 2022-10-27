<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class GoodsDigitalFingerprintIdentifyResultData extends Model
{
    // 鉴定结果
    /**
     * @example REAL
     *
     * @var string
     */
    public $identificationResult;

    // 鉴定结果描述
    /**
     * @example 描述
     *
     * @var string
     */
    public $description;

    // 商品数字指纹鉴定点鉴定结果列表
    /**
     * @example {"sub_point_name":"正面","result":"REAL","grade":"0.92"}
     *
     * @var GoodsDigitalFingerprintPointIdentificationResult[]
     */
    public $pointIdentificationResults;
    protected $_name = [
        'identificationResult'       => 'identification_result',
        'description'                => 'description',
        'pointIdentificationResults' => 'point_identification_results',
    ];

    public function validate()
    {
        Model::validateRequired('identificationResult', $this->identificationResult, true);
        Model::validateRequired('description', $this->description, true);
        Model::validateRequired('pointIdentificationResults', $this->pointIdentificationResults, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->identificationResult) {
            $res['identification_result'] = $this->identificationResult;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->pointIdentificationResults) {
            $res['point_identification_results'] = [];
            if (null !== $this->pointIdentificationResults && \is_array($this->pointIdentificationResults)) {
                $n = 0;
                foreach ($this->pointIdentificationResults as $item) {
                    $res['point_identification_results'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GoodsDigitalFingerprintIdentifyResultData
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['identification_result'])) {
            $model->identificationResult = $map['identification_result'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['point_identification_results'])) {
            if (!empty($map['point_identification_results'])) {
                $model->pointIdentificationResults = [];
                $n                                 = 0;
                foreach ($map['point_identification_results'] as $item) {
                    $model->pointIdentificationResults[$n++] = null !== $item ? GoodsDigitalFingerprintPointIdentificationResult::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
