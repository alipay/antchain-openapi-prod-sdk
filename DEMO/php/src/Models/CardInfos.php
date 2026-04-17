<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DEMO\Models;

use AlibabaCloud\Tea\Model;

class CardInfos extends Model
{
    // x
    /**
     * @example
     *
     * @var Identity
     */
    public $domianInfo;

    // 12
    /**
     * @example 张三
     *
     * @var string
     */
    public $test;
    protected $_name = [
        'domianInfo' => 'domian_info',
        'test'       => 'test',
    ];

    public function validate()
    {
        Model::validateRequired('domianInfo', $this->domianInfo, true);
        Model::validateRequired('test', $this->test, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->domianInfo) {
            $res['domian_info'] = null !== $this->domianInfo ? $this->domianInfo->toMap() : null;
        }
        if (null !== $this->test) {
            $res['test'] = $this->test;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CardInfos
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['domian_info'])) {
            $model->domianInfo = Identity::fromMap($map['domian_info']);
        }
        if (isset($map['test'])) {
            $model->test = $map['test'];
        }

        return $model;
    }
}
