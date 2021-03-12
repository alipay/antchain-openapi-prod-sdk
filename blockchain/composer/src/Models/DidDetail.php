<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class DidDetail extends Model
{
    // 控制者的did描述符
    /**
     * @example did:mychain:xxxx
     *
     * @var string
     */
    public $controller;

    // did描述符
    /**
     * @example did:mychain:xxxxx
     *
     * @var string
     */
    public $did;

    // did doc
    /**
     * @example json字段
     *
     * @var string
     */
    public $didDoc;
    protected $_name = [
        'controller' => 'controller',
        'did'        => 'did',
        'didDoc'     => 'did_doc',
    ];

    public function validate()
    {
        Model::validateRequired('controller', $this->controller, true);
        Model::validateRequired('did', $this->did, true);
        Model::validateRequired('didDoc', $this->didDoc, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->controller) {
            $res['controller'] = $this->controller;
        }
        if (null !== $this->did) {
            $res['did'] = $this->did;
        }
        if (null !== $this->didDoc) {
            $res['did_doc'] = $this->didDoc;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DidDetail
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['controller'])) {
            $model->controller = $map['controller'];
        }
        if (isset($map['did'])) {
            $model->did = $map['did'];
        }
        if (isset($map['did_doc'])) {
            $model->didDoc = $map['did_doc'];
        }

        return $model;
    }
}
