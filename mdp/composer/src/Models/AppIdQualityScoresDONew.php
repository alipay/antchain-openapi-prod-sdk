<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MDP\Models;

use AlibabaCloud\Tea\Model;

class AppIdQualityScoresDONew extends Model
{
    // modelId
    /**
     * @example 1001
     *
     * @var string
     */
    public $modelid;

    // qualityscore
    /**
     * @example 0.1
     *
     * @var string
     */
    public $qualityscore;
    protected $_name = [
        'modelid'      => 'modelid',
        'qualityscore' => 'qualityscore',
    ];

    public function validate()
    {
        Model::validateRequired('modelid', $this->modelid, true);
        Model::validateRequired('qualityscore', $this->qualityscore, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->modelid) {
            $res['modelid'] = $this->modelid;
        }
        if (null !== $this->qualityscore) {
            $res['qualityscore'] = $this->qualityscore;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AppIdQualityScoresDONew
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['modelid'])) {
            $model->modelid = $map['modelid'];
        }
        if (isset($map['qualityscore'])) {
            $model->qualityscore = $map['qualityscore'];
        }

        return $model;
    }
}
