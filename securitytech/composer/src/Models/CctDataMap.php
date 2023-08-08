<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SECURITYTECH\Models;

use AlibabaCloud\Tea\Model;

class CctDataMap extends Model
{
    // text
    /**
     * @example text
     *
     * @var string[]
     */
    public $text;

    // PICTURE
    /**
     * @example PICTURE
     *
     * @var string[]
     */
    public $picture;
    protected $_name = [
        'text'    => 'text',
        'picture' => 'picture',
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
        if (null !== $this->picture) {
            $res['picture'] = $this->picture;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CctDataMap
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['text'])) {
            if (!empty($map['text'])) {
                $model->text = $map['text'];
            }
        }
        if (isset($map['picture'])) {
            if (!empty($map['picture'])) {
                $model->picture = $map['picture'];
            }
        }

        return $model;
    }
}
