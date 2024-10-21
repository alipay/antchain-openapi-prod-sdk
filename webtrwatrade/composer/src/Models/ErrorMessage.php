<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\WEBTRWATRADE\Models;

use AlibabaCloud\Tea\Model;

class ErrorMessage extends Model
{
    // 错误码
    /**
     * @example W3S-000-5-O001
     *
     * @var string
     */
    public $displayedCode;

    // 错误描述
    /**
     * @example param error [id is null]
     *
     * @var string
     */
    public $displayedMessage;
    protected $_name = [
        'displayedCode'    => 'displayed_code',
        'displayedMessage' => 'displayed_message',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->displayedCode) {
            $res['displayed_code'] = $this->displayedCode;
        }
        if (null !== $this->displayedMessage) {
            $res['displayed_message'] = $this->displayedMessage;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ErrorMessage
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['displayed_code'])) {
            $model->displayedCode = $map['displayed_code'];
        }
        if (isset($map['displayed_message'])) {
            $model->displayedMessage = $map['displayed_message'];
        }

        return $model;
    }
}
