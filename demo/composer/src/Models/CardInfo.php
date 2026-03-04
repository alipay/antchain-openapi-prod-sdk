<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DEMO\Models;

use AlibabaCloud\Tea\Model;

class CardInfo extends Model
{
    // 1
    /**
     * @example
     *
     * @var DemoClass
     */
    public $demoInfo;

    // 测试
    /**
     * @example 张三
     *
     * @var string
     */
    public $name;
    protected $_name = [
        'demoInfo' => 'demo_info',
        'name'     => 'name',
    ];

    public function validate()
    {
        Model::validateRequired('demoInfo', $this->demoInfo, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->demoInfo) {
            $res['demo_info'] = null !== $this->demoInfo ? $this->demoInfo->toMap() : null;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CardInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['demo_info'])) {
            $model->demoInfo = DemoClass::fromMap($map['demo_info']);
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }

        return $model;
    }
}
