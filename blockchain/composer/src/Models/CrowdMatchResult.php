<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class CrowdMatchResult extends Model
{
    // 人群匹配结果
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
     * @return CrowdMatchResult
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
