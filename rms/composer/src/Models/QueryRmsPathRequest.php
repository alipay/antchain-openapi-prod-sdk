<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class QueryRmsPathRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // requests
    /**
     * @var FolderRequestCmd[]
     */
    public $requests;
    protected $_name = [
        'authToken' => 'auth_token',
        'requests'  => 'requests',
    ];

    public function validate()
    {
        Model::validateRequired('requests', $this->requests, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->requests) {
            $res['requests'] = [];
            if (null !== $this->requests && \is_array($this->requests)) {
                $n = 0;
                foreach ($this->requests as $item) {
                    $res['requests'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryRmsPathRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['requests'])) {
            if (!empty($map['requests'])) {
                $model->requests = [];
                $n               = 0;
                foreach ($map['requests'] as $item) {
                    $model->requests[$n++] = null !== $item ? FolderRequestCmd::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
