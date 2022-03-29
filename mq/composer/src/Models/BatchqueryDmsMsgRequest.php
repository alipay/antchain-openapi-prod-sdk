<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class BatchqueryDmsMsgRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // born_time_begin
    /**
     * @var string
     */
    public $bornTimeBegin;

    // born_time_end
    /**
     * @var string
     */
    public $bornTimeEnd;

    // current_page
    /**
     * @var int
     */
    public $pageNum;

    // eventcode
    /**
     * @var string
     */
    public $eventcode;

    // instance_id
    /**
     * @var string
     */
    public $instanceId;

    // page_size
    /**
     * @var int
     */
    public $pageSize;

    // topic
    /**
     * @var string
     */
    public $topic;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'bornTimeBegin'     => 'born_time_begin',
        'bornTimeEnd'       => 'born_time_end',
        'pageNum'           => 'page_num',
        'eventcode'         => 'eventcode',
        'instanceId'        => 'instance_id',
        'pageSize'          => 'page_size',
        'topic'             => 'topic',
    ];

    public function validate()
    {
        Model::validateRequired('bornTimeBegin', $this->bornTimeBegin, true);
        Model::validateRequired('bornTimeEnd', $this->bornTimeEnd, true);
        Model::validateRequired('eventcode', $this->eventcode, true);
        Model::validateRequired('instanceId', $this->instanceId, true);
        Model::validateRequired('topic', $this->topic, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->bornTimeBegin) {
            $res['born_time_begin'] = $this->bornTimeBegin;
        }
        if (null !== $this->bornTimeEnd) {
            $res['born_time_end'] = $this->bornTimeEnd;
        }
        if (null !== $this->pageNum) {
            $res['page_num'] = $this->pageNum;
        }
        if (null !== $this->eventcode) {
            $res['eventcode'] = $this->eventcode;
        }
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->topic) {
            $res['topic'] = $this->topic;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BatchqueryDmsMsgRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['born_time_begin'])) {
            $model->bornTimeBegin = $map['born_time_begin'];
        }
        if (isset($map['born_time_end'])) {
            $model->bornTimeEnd = $map['born_time_end'];
        }
        if (isset($map['page_num'])) {
            $model->pageNum = $map['page_num'];
        }
        if (isset($map['eventcode'])) {
            $model->eventcode = $map['eventcode'];
        }
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['topic'])) {
            $model->topic = $map['topic'];
        }

        return $model;
    }
}
