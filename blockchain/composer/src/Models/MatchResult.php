<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class MatchResult extends Model
{
    // 是否匹配
    /**
     * @example true, false
     *
     * @var bool
     */
    public $match;
    protected $_name = [
        'match' => 'match',
    ];

    public function validate()
    {
        Model::validateRequired('match', $this->match, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->match) {
            $res['match'] = $this->match;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return MatchResult
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['match'])) {
            $model->match = $map['match'];
        }

        return $model;
    }
}
