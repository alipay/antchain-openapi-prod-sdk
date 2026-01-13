<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MARKETINGAGENT\Models;

use AlibabaCloud\Tea\Model;

class Part extends Model
{
    // the string content of the text part.
    /**
     * @example content
     *
     * @var string
     */
    public $text;
    protected $_name = [
        'text' => 'text',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->text) {
            $res['text'] = $this->text;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Part
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['text'])) {
            $model->text = $map['text'];
        }

        return $model;
    }
}
