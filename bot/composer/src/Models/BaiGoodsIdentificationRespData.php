<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class BaiGoodsIdentificationRespData extends Model
{
    // 鉴定结果
    // REAL：鉴定为真
    // FAKE：鉴定为假
    // UNABLE_IDENTIFY：无法鉴定
    /**
     * @example REAL
     *
     * @var string
     */
    public $identificationResult;

    // 整体鉴定分数
    /**
     * @example 0.99
     *
     * @var string
     */
    public $grade;

    // 整体鉴定报告描述
    /**
     * @example AI鉴定成功
     *
     * @var string
     */
    public $description;

    // 鉴定点鉴定结果列表
    /**
     * @example
     *
     * @var BaiGoodsPointIdentificationResult[]
     */
    public $pointIdentificationResults;

    // 鉴定评价
    /**
     * @example 完全同一，趋于同一，和不同一
     *
     * @var string
     */
    public $appraiseMessage;

    // 用户自定义字符串，系统不做处理，会在响应体中带回
    /**
     * @example state
     *
     * @var string
     */
    public $outState;
    protected $_name = [
        'identificationResult'       => 'identification_result',
        'grade'                      => 'grade',
        'description'                => 'description',
        'pointIdentificationResults' => 'point_identification_results',
        'appraiseMessage'            => 'appraise_message',
        'outState'                   => 'out_state',
    ];

    public function validate()
    {
        Model::validateRequired('identificationResult', $this->identificationResult, true);
        Model::validateRequired('grade', $this->grade, true);
        Model::validateRequired('pointIdentificationResults', $this->pointIdentificationResults, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->identificationResult) {
            $res['identification_result'] = $this->identificationResult;
        }
        if (null !== $this->grade) {
            $res['grade'] = $this->grade;
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
        if (null !== $this->appraiseMessage) {
            $res['appraise_message'] = $this->appraiseMessage;
        }
        if (null !== $this->outState) {
            $res['out_state'] = $this->outState;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BaiGoodsIdentificationRespData
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['identification_result'])) {
            $model->identificationResult = $map['identification_result'];
        }
        if (isset($map['grade'])) {
            $model->grade = $map['grade'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['point_identification_results'])) {
            if (!empty($map['point_identification_results'])) {
                $model->pointIdentificationResults = [];
                $n                                 = 0;
                foreach ($map['point_identification_results'] as $item) {
                    $model->pointIdentificationResults[$n++] = null !== $item ? BaiGoodsPointIdentificationResult::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['appraise_message'])) {
            $model->appraiseMessage = $map['appraise_message'];
        }
        if (isset($map['out_state'])) {
            $model->outState = $map['out_state'];
        }

        return $model;
    }
}
