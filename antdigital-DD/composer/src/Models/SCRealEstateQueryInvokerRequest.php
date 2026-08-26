<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\DD\Models;

use AlibabaCloud\Tea\Model;

use AntChain\DD\Models\Header;
use AntChain\DD\Models\SCRealEstateQueryBody;

class SCRealEstateQueryInvokerRequest extends Model {
    protected $_name = [
        'header' => 'header',
        'body' => 'body',
    ];
    public function validate() {
        Model::validateRequired('header', $this->header, true);
        Model::validateRequired('body', $this->body, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->header) {
            $res['header'] = null !== $this->header ? $this->header->toMap() : null;
        }
        if (null !== $this->body) {
            $res['body'] = null !== $this->body ? $this->body->toMap() : null;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return SCRealEstateQueryInvokerRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['header'])){
            $model->header = Header::fromMap($map['header']);
        }
        if(isset($map['body'])){
            $model->body = SCRealEstateQueryBody::fromMap($map['body']);
        }
        return $model;
    }
    // header
    /**
     * @example "header": {}
     * @var Header
     */
    public $header;

    // body
    /**
     * @example "body":{}
     * @var SCRealEstateQueryBody
     */
    public $body;

}
