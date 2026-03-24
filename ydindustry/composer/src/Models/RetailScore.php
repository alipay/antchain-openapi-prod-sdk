<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YDINDUSTRY\Models;

use AlibabaCloud\Tea\Model;

class RetailScore extends Model
{
    // 用户ID
    /**
     * @example XXXXX
     *
     * @var string
     */
    public $userId;

    // 评分
    /**
     * @example 13.21
     *
     * @var string
     */
    public $score;

    // 拓展数据
    /**
     * @example json格式
     *
     * @var string
     */
    public $extParam;
    protected $_name = [
        'userId'   => 'user_id',
        'score'    => 'score',
        'extParam' => 'ext_param',
    ];

    public function validate()
    {
        Model::validateRequired('userId', $this->userId, true);
        Model::validateRequired('score', $this->score, true);
        Model::validateRequired('extParam', $this->extParam, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }
        if (null !== $this->score) {
            $res['score'] = $this->score;
        }
        if (null !== $this->extParam) {
            $res['ext_param'] = $this->extParam;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RetailScore
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['user_id'])) {
            $model->userId = $map['user_id'];
        }
        if (isset($map['score'])) {
            $model->score = $map['score'];
        }
        if (isset($map['ext_param'])) {
            $model->extParam = $map['ext_param'];
        }

        return $model;
    }
}
