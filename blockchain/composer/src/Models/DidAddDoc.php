<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class DidAddDoc extends Model
{
    // did doc content
    /**
     * @example json string
     *
     * @var string
     */
    public $doc;
    protected $_name = [
        'doc' => 'doc',
    ];

    public function validate()
    {
        Model::validateRequired('doc', $this->doc, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->doc) {
            $res['doc'] = $this->doc;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DidAddDoc
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['doc'])) {
            $model->doc = $map['doc'];
        }

        return $model;
    }
}
