<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BCCR\Models;

use AlibabaCloud\Tea\Model;

class ResembleDetail extends Model
{
    // 相似分数
    /**
     * @example 0.99
     *
     * @var string
     */
    public $score;

    // 长度
    /**
     * @example 02:59:59
     *
     * @var string
     */
    public $length;

    // 明细类型，例如VIDEO_SEGMENT表示视频区间相似
    /**
     * @example VIDEO_SEGMENT
     *
     * @var string
     */
    public $type;

    // 查询源文件的位置信息
    /**
     * @example
     *
     * @var ResemblePositionData
     */
    public $queryPositionData;

    // 相似文件的位置信息
    /**
     * @example
     *
     * @var ResemblePositionData
     */
    public $matchPositionData;
    protected $_name = [
        'score'             => 'score',
        'length'            => 'length',
        'type'              => 'type',
        'queryPositionData' => 'query_position_data',
        'matchPositionData' => 'match_position_data',
    ];

    public function validate()
    {
        Model::validateRequired('score', $this->score, true);
        Model::validateRequired('type', $this->type, true);
        Model::validateRequired('queryPositionData', $this->queryPositionData, true);
        Model::validateRequired('matchPositionData', $this->matchPositionData, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->score) {
            $res['score'] = $this->score;
        }
        if (null !== $this->length) {
            $res['length'] = $this->length;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->queryPositionData) {
            $res['query_position_data'] = null !== $this->queryPositionData ? $this->queryPositionData->toMap() : null;
        }
        if (null !== $this->matchPositionData) {
            $res['match_position_data'] = null !== $this->matchPositionData ? $this->matchPositionData->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ResembleDetail
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['score'])) {
            $model->score = $map['score'];
        }
        if (isset($map['length'])) {
            $model->length = $map['length'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['query_position_data'])) {
            $model->queryPositionData = ResemblePositionData::fromMap($map['query_position_data']);
        }
        if (isset($map['match_position_data'])) {
            $model->matchPositionData = ResemblePositionData::fromMap($map['match_position_data']);
        }

        return $model;
    }
}
