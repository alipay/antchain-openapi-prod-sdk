<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class QueryOptestRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // string
    /**
     * @var string
     */
    public $str;

    // long
    /**
     * @var int
     */
    public $lon;

    // arr_str
    /**
     * @var string[]
     */
    public $arrStr;

    // stru
    /**
     * @var Zone
     */
    public $stru;

    // arr_stru
    /**
     * @var VPC[]
     */
    public $arrStru;
    protected $_name = [
        'authToken' => 'auth_token',
        'str'       => 'str',
        'lon'       => 'lon',
        'arrStr'    => 'arr_str',
        'stru'      => 'stru',
        'arrStru'   => 'arr_stru',
    ];

    public function validate()
    {
        Model::validateRequired('str', $this->str, true);
        Model::validateRequired('lon', $this->lon, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->str) {
            $res['str'] = $this->str;
        }
        if (null !== $this->lon) {
            $res['lon'] = $this->lon;
        }
        if (null !== $this->arrStr) {
            $res['arr_str'] = $this->arrStr;
        }
        if (null !== $this->stru) {
            $res['stru'] = null !== $this->stru ? $this->stru->toMap() : null;
        }
        if (null !== $this->arrStru) {
            $res['arr_stru'] = [];
            if (null !== $this->arrStru && \is_array($this->arrStru)) {
                $n = 0;
                foreach ($this->arrStru as $item) {
                    $res['arr_stru'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryOptestRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['str'])) {
            $model->str = $map['str'];
        }
        if (isset($map['lon'])) {
            $model->lon = $map['lon'];
        }
        if (isset($map['arr_str'])) {
            if (!empty($map['arr_str'])) {
                $model->arrStr = $map['arr_str'];
            }
        }
        if (isset($map['stru'])) {
            $model->stru = Zone::fromMap($map['stru']);
        }
        if (isset($map['arr_stru'])) {
            if (!empty($map['arr_stru'])) {
                $model->arrStru = [];
                $n              = 0;
                foreach ($map['arr_stru'] as $item) {
                    $model->arrStru[$n++] = null !== $item ? VPC::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
