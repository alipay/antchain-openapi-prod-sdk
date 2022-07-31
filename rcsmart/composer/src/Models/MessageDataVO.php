<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RCSMART\Models;

use AlibabaCloud\Tea\Model;

class MessageDataVO extends Model
{
    // 检测文本
    /**
     * @example xxxx
     *
     * @var string
     */
    public $data;

    // xxxx
    /**
     * @example
     *
     * @var Pair
     */
    public $extendsMap;
    protected $_name = [
        'data'       => 'data',
        'extendsMap' => 'extends_map',
    ];

    public function validate()
    {
        Model::validateRequired('data', $this->data, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->data) {
            $res['data'] = $this->data;
        }
        if (null !== $this->extendsMap) {
            $res['extends_map'] = null !== $this->extendsMap ? $this->extendsMap->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return MessageDataVO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['data'])) {
            $model->data = $map['data'];
        }
        if (isset($map['extends_map'])) {
            $model->extendsMap = Pair::fromMap($map['extends_map']);
        }

        return $model;
    }
}
